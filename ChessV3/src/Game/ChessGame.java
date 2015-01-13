package Game;

import java.util.Random;

import Board.Board;
import Board.ChessBoard;
import ChessExeptions.IllegalMoveExeption;
import Color.Color;
import GameState.GameState;
import Move.IMove;
import Player.Player;

public class ChessGame extends AbstractGame {

	private	Board board;
	public ChessGame() {
		super(2);
		board = new ChessBoard();
	}

	@Override
	public void initGame(Player p1, Player p2) {
		playerArray[0] = p1;
		playerArray[1] = p2;
		gameRun = true;
		Random rn = new Random();
		currentPlayer = Math.abs(rn.nextInt() % 2);
		playerArray[currentPlayer].notifyPlayer(GameState.None, true);
		playerArray[(currentPlayer + 1)%2].notifyPlayer(GameState.None, false);
		System.out.println(board);
	}
	
	
	@Override
	public void playGame(IMove move) throws IllegalMoveExeption {
		GameState gameState = board.makeMove(playerArray[currentPlayer].getColor(), move);
		currentPlayer = (currentPlayer + 1) % 2;
		playerArray[currentPlayer].notifyPlayer(gameState, true);
		playerArray[(currentPlayer + 1) % 2].notifyPlayer(gameState, false);
		System.out.println(board);
	}
	
	@Override
	public Player currentPlayer(){
		return playerArray[currentPlayer];
	}
	
	@Override
	public boolean gameInRun() {
		return gameRun;
	}
	@Override
	public void finishGame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateGame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGame(Color color, IMove move) throws IllegalMoveExeption {
		// TODO Auto-generated method stub
		
	}
	
}
