package Piece;

import Behaviour.PlusBeh;
import Color.Color;

public class Rook extends Piece {

	public Rook(Color color) {
		super(color);
		validBeh.add(new PlusBeh());
	}

	@Override
	public String toString() {
		return "R" + (color == Color.WHITE ? "w" :"b") ;
	}
	

}
