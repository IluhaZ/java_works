package Game;

import java.util.Random;

import Board.Board;
import Board.ChessBoard;
import ChessExeptions.IllegalMoveExeption;
import GameState.GameState;
import Move.AbstractMove;
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
		Random rn = new Random();
		currentPlayer = rn.nextInt() % 2;
		playerArray[currentPlayer].notifyPlayer(GameState.None, true);
		playerArray[(currentPlayer + 1)%2].notifyPlayer(GameState.None, false);
	}
	
	@Override
	public void playGame( AbstractMove move) throws IllegalMoveExeption{
		GameState gameState = board.makeMove(playerArray[currentPlayer].getColor(), move);
		currentPlayer = (currentPlayer + 1) % 2;
		playerArray[currentPlayer].notifyPlayer(gameState, true);
		playerArray[(currentPlayer + 1) % 2].notifyPlayer(gameState, false);
	}
	
	

	@Override
	public void finishGame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateGame() {
		// TODO Auto-generated method stub

	}
}
