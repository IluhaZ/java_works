package Player;

import java.util.Scanner;

import Color.Color;
import Game.IGame;
import GameState.GameState;
import Move.AbstractMove;
import Move.ChessMove;

public class HumanPlayer extends Player{

	private Color color;
	Scanner input = new Scanner(System.in);
	public HumanPlayer(IGame game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void startGame() {
		if(myTurn == true)
			color = Color.WHITE;
		else
			color = Color.BLACK;
	}

	@Override
	public boolean makeMove() {
		if(myTurn == false){
			System.out.println("not my turn");
			return false;
		}
		AbstractMove move;
		boolean wrongMove = true;
		
		while(wrongMove ){
			try {
				wrongMove = false;
				System.out.print(color == Color.WHITE ? "White":"Black");
				System.out.println(" Player make move \n ");
				String str = input.next();
				move = new ChessMove(str);
			} catch (Exception e) {
				//e.printStackTrace();
				move = null;
				wrongMove = true;
				System.out.println("wrong string , try again\n");
				
			}
			if(wrongMove == false) {
				try{
					
					game.playGame(move);
					
				} catch(Exception ex){
					//ex.printStackTrace();
					wrongMove = true;
					System.out.println("wrong move , try again\n");
				}
			}
			
		}
		
		
		return true;
		
	}
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void notifyPlayer(GameState gameState, boolean myTurn) {
		this.myTurn = myTurn;
		//TODO: implement gameState;
	}


	@Override
	protected void finalize() throws Throwable {
		input.close();
		super.finalize();
	}

	
}
