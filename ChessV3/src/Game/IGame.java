package Game;

import ChessExeptions.IllegalMoveExeption;
import Move.IMove;
import Player.Player;

public interface IGame {
	
	void initGame(Player p1, Player p2);
	
	void playGame(IMove move) throws IllegalMoveExeption;
	
	void finishGame();
	
	void updateGame();
	
	Player currentPlayer();
	
	boolean gameInRun();


	
}
