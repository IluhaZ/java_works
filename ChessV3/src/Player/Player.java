package Player;

import Color.Color;
import Game.IGame;
import GameState.GameState;

public abstract class Player {
	
	protected IGame game;
	protected boolean myTurn;
	
	public Player(IGame game) {
		this.game = game;
	}
	public abstract boolean makeMove();
	
	public abstract void notifyPlayer(GameState gameState, boolean myTurn);
	
	public abstract void startGame();
	public abstract  Color getColor();
	
}
