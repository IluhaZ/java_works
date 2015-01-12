package Player;

import Color.Color;
import Game.GameInterface;
import GameState.GameState;

public abstract class Player {
	
	protected GameInterface game;
	protected boolean myTurn;
	
	public Player(GameInterface game) {
		this.game = game;
	}
	public abstract boolean makeMove();
	
	public abstract void notifyPlayer(GameState gameState, boolean myTurn);
	
	public abstract void startGame();
	public abstract  Color getColor();
	
}
