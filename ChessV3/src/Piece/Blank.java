package Piece;

import Color.Color;


public class Blank extends Piece {

	public Blank(Color color) {
		super(color);
	}

	@Override
	public String toString() {
		return "- ";
	}
	
}
