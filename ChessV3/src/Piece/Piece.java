package Piece;

import java.util.ArrayList;
import java.util.List;

import Behaviour.AbstractBehaviour;
import ChessExeptions.IllegalMoveDestination;
import Color.Color;
import Point.Point;

public abstract class Piece  {
	
	protected List<AbstractBehaviour> validBeh;
	Color color;
	
	public Piece(Color color) {
		this.color = color;
		validBeh = new ArrayList<AbstractBehaviour>();
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public boolean isBlank(){
		return color == Color.NOCOLOR;
	}
	public List<Point> getValidPass(Point src, Point dst) throws IllegalMoveDestination{
		List<Point> validMoves = new ArrayList<Point>();
		int exeptionThrow = 0;
		for (AbstractBehaviour ab : validBeh) {
			try{
				validMoves.addAll(ab.getPath(src, dst));
			} catch( IllegalMoveDestination ex){
				++exeptionThrow;
			}
		}
		if(exeptionThrow == validBeh.size())
			throw new IllegalMoveDestination("wrong Destination");
		return validMoves;
	}

	
	
}
