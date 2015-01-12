package Player;

import java.util.Scanner;

import ChessExeptions.IllegalMoveExeption;
import Color.Color;
import Game.GameInterface;
import GameState.GameState;
import Move.AbstractMove;
import Move.ChessMove;

public class HumanPlayer extends Player{

	private Color color;
	public HumanPlayer(GameInterface game) {
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
		Scanner input = new Scanner(System.in);
		while(wrongMove ){
			try {
				wrongMove = false;
				System.out.print("make move \n ");
				String str = input.next();
				move = new ChessMove(str);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				move = null;
				wrongMove = true;
				System.out.println("wrong string , try again\n");
			}
			
			try{
				wrongMove = false;
				
				game.playGame(move);
				
			} catch(IllegalMoveExeption ex){
				ex.printStackTrace();
				wrongMove = true;
				System.out.println("wrong string , try again\n");
			}
			//TODO: make another move
		}
		input.close();
		
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


	

	
}
