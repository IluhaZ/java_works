package UniTest;

import GameMenu.IMenu;
import GameMenu.Menu;

public class mainTest {

	public static void main(String[] args) {
		IMenu menu = new Menu();
		menu.newGame();
		menu.startGame();
	}

}
