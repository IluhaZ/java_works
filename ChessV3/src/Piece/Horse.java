package Piece;

import Behaviour.XBeh;
import Color.Color;

public class Horse extends Piece {
	
	public Horse(Color color) {
		super(color);
		validBeh.add(new XBeh());
	}

	@Override
	public String toString() {
		return "H" + (color == Color.WHITE ? "w" :"b") ;
	} 
	
}
