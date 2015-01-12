package Piece;

import Behaviour.KingBeh;
import Color.Color;

public class King extends Piece {

	public King(Color color) {
		super(color);
		validBeh.add(new KingBeh());
	}

	@Override
	public String toString() {
		return "K" + (color == Color.WHITE ? "w" :"b") ;
	}
	

}
