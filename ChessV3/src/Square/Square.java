package Square;

import Color.Color;
import Piece.Piece;

public class Square implements ISquare{
	
	private Piece piece;
	
	public Square(Piece piece) {
		this.piece = piece;
	}
	
	@Override
	public Piece getPiece() {
		return piece;
	}

	@Override
	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	@Override
	public boolean isEmpty() {
		return piece.getColor() == Color.NOCOLOR;
	}

	@Override
	public boolean isNotEmpty() {
		return piece.getColor() != Color.NOCOLOR;
	}
	
}
