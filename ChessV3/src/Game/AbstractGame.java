package Game;

import ChessExeptions.IllegalMoveExeption;
import Color.Color;
import Move.AbstractMove;
import Player.Player;

public abstract class AbstractGame implements IGame {
	
	protected Player[] playerArray;
	protected boolean gameRun; 
	protected int currentPlayer;

	public AbstractGame(int numOfPlayers) {
		playerArray = new Player[numOfPlayers];
	}

	public abstract void playGame(Color color, AbstractMove move) throws IllegalMoveExeption;

	public abstract Player currentPlayer();

	public abstract boolean gameInRun();

	
}
