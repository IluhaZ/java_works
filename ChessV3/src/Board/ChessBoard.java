package Board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ChessExeptions.IllegalMoveCollor;
import ChessExeptions.IllegalMoveExeption;
import ChessExeptions.IllegalMovePathNotFree;
import ChessExeptions.IllegalMoveWrongMove;
import Color.Color;
import GameState.GameState;
import Move.AbstractMove;
import Piece.*;
import Point.Point;
import Square.*;


public class ChessBoard implements Board{
	private ISquare[][] board;
	private Point whiteKingPoint = new Point(0, 4);
	private Point blackKingPoint = new Point(7, 4);
	private Map<Color,Point> kings = new HashMap<>();
	public ChessBoard() {
		board = new Square[8][8];
		kings.put(Color.WHITE, whiteKingPoint);
		kings.put(Color.BLACK, blackKingPoint);
		initBoard();
	}

	@Override
	public GameState makeMove(Color color, AbstractMove move) throws IllegalMoveExeption {
		Point srcPoint = move.getPointSrc();
		Point dstPoint = move.getPointDst();
		Piece srcPiece = board[srcPoint.line][srcPoint.column].getPiece();
		Piece dstPiece = board[dstPoint.line][dstPoint.column].getPiece();
		
		if(srcPiece.getColor() != color) throw new IllegalMoveCollor();
		if(srcPiece.getColor() == dstPiece.getColor()) throw new IllegalMoveCollor();
		
		List<Point> passList = srcPiece.getValidPass(srcPoint, dstPoint);
		for (Point point : passList) {
			if(board[point.line][point.column].isEmpty()) throw new IllegalMovePathNotFree();
		}
		
		legalMovePawn(srcPiece, dstPiece, srcPoint, dstPoint);
		PerformMove(srcPoint, dstPoint);
		checkCheck(kings.get(color));
		
		return checkCheck(kings.get(Color.oposite(color)));
	}

	private GameState checkCheck(Point point) {
		
		return null;
		
	}

	private void PerformMove(Point srcPoint, Point dstPoint) {
		board[dstPoint.line][dstPoint.column].setPiece(board[srcPoint.line][srcPoint.column].getPiece());
		board[srcPoint.line][srcPoint.column].setPiece(new Blank(Color.NOCOLOR) );
	}

	private void legalMovePawn(Piece srcPiece, Piece dstPiece, Point srcPoint, Point dstPoint) throws IllegalMoveWrongMove {
		if (srcPiece instanceof Pawn){
			isForwordDest(srcPiece.getColor(),srcPoint, dstPoint);
			if(isMoveToSide(srcPoint, dstPoint)){
				if(dstPiece.isBlank()) throw new IllegalMoveWrongMove();
			}
			else 
				if(!dstPiece.isBlank()) throw new IllegalMoveWrongMove();
		}
	}
	
	private boolean isMoveToSide(Point srcPoint, Point dstPoint) {
		if(srcPoint.column == dstPoint.column)
			return false;
		return true;
	}

	private boolean isForwordDest(Color color, Point srcPoint, Point dstPoint) throws IllegalMoveWrongMove {
		if(color == Color.WHITE){
			if(srcPoint.line != dstPoint.line + 1) throw new IllegalMoveWrongMove();
		}
		else if(color == Color.BLACK){
			if(srcPoint.line != dstPoint.line -1) throw new IllegalMoveWrongMove();
		}
			
		return false;
	}

	
	private void initBoard() {
		board[0][0] = new Square(new Rook(Color.WHITE));
		board[0][1] = new Square(new Horse(Color.WHITE));
		board[0][2] = new Square(new Bishop(Color.WHITE));
		board[0][3] = new Square(new Queen(Color.WHITE));
		board[0][4] = new Square(new King(Color.WHITE));
		board[0][5] = new Square(new Bishop(Color.WHITE));
		board[0][6] = new Square(new Horse(Color.WHITE));
		board[0][7] = new Square(new Rook(Color.WHITE));
		
		board[7][0] = new Square(new Rook(Color.BLACK));
		board[7][1] = new Square(new Horse(Color.BLACK));
		board[7][2] = new Square(new Bishop(Color.BLACK));
		board[7][3] = new Square(new Queen(Color.BLACK));
		board[7][4] = new Square(new King(Color.BLACK));
		board[7][5] = new Square(new Bishop(Color.BLACK));
		board[7][6] = new Square(new Horse(Color.BLACK));
		board[7][7] = new Square(new Rook(Color.BLACK));
		
		for (int i = 0; i < board.length; i++) {
			board[1][i] = new Square( new Pawn(Color.WHITE));
			board[6][i] = new Square( new Pawn(Color.BLACK));
			board[3][i] = new Square( new Blank(Color.NOCOLOR));
			board[4][i] = new Square( new Blank(Color.NOCOLOR));
			board[5][i] = new Square( new Blank(Color.NOCOLOR));
			board[2][i] = new Square( new Blank(Color.NOCOLOR));
		}
	}
	
	public String toString() {
		StringBuilder boardLayout = new StringBuilder();
		
		boardLayout.append("Board " ) .append("\n").append("  ");
		
		for (int i = 0; i < board.length; i++) {
			char ch = (char) ('a'+ i);
			boardLayout.append(ch).append("   ");
		}
		boardLayout.append("\n");
		for (int i = 0; i < board.length; i++) {
			boardLayout.append(i+1).append(" ");
			for (int j = 0; j < board.length; j++) {
				boardLayout.append( board[i][j].getPiece().toString()).append("  ");
				
			}
			boardLayout.append("\n");
		}
		return boardLayout.toString();
	}
}
