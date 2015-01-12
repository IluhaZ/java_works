package Piece;

import Behaviour.PlusBeh;
import Behaviour.XBeh;
import Color.Color;

public class Queen extends Piece {
	public Queen(Color color) {
		super(color);
		validBeh.add(new XBeh());
		validBeh.add(new PlusBeh());
	}

	@Override
	public String toString() {
		return "Q" + (color == Color.WHITE ? "w" :"b") ;
	}
	
}
