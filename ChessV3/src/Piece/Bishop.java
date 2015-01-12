package Piece;

import Behaviour.XBeh;
import Color.Color;

public class Bishop extends Piece {

	public Bishop(Color color) {
		super(color);
		
		validBeh.add(new XBeh());
	}

	@Override
	public String toString() {
		return "B" + (color == Color.WHITE ? "w" :"b") ;
	}
	

}
