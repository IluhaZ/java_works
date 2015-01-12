package Game;

import ChessExeptions.IllegalMoveExeption;
import Move.AbstractMove;
import Player.Player;

public interface GameInterface {
	
	void initGame(Player p1, Player p2);
	
	void playGame( AbstractMove move) throws IllegalMoveExeption;
	
	void finishGame();
	
	void updateGame();

	
}
