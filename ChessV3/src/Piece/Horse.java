package Piece;

import Behaviour.HorseBeh;
import Color.Color;

public class Horse extends Piece {
	
	public Horse(Color color) {
		super(color);
		validBeh.add(new HorseBeh());
	}

	@Override
	public String toString() {
		return "H" + (color == Color.WHITE ? "w" :"b") ;
	} 
	
}
