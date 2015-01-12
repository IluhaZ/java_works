package GameMenu;

import java.util.LinkedHashMap;
import java.util.Map;

import Game.AbstractGame;
import Game.ChessGame;
import Player.HumanPlayer;
import Player.Player;

public class Menu implements IMenu{
	
	private Map<String,AbstractGame> games = new LinkedHashMap<>();
	
	@Override
	public void newGame() {
		AbstractGame g1 = new ChessGame();
		Player p1 = new HumanPlayer(g1);
		Player p2 = new HumanPlayer(g1);
		g1.initGame(p1, p2);
		p1.startGame();
		p2.startGame();
		games.put("TestGame", g1);
	}
	
	@Override
	public void startGame() {
		AbstractGame g1 = games.get("TestGame");
		while(g1.gameInRun()){
			g1.currentPlayer().makeMove();
		}
	}
	@Override
	public void loadGame(String gameName){
		
	}
	
	@Override
	public void saveGame(){
		
	}
}
