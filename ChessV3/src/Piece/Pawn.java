package Piece;

import Behaviour.PawnBeh;
import Color.Color;


public class Pawn extends Piece {

	public Pawn(Color color) {
		super(color);
		validBeh.add(new PawnBeh());
	}

	@Override
	public String toString() {
		return "p" + (color == Color.WHITE ? "w":"b");
	}
	

}
