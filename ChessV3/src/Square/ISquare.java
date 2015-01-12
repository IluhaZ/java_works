package Square;

import Piece.Piece;

public interface ISquare {

	Piece getPiece();

	void setPiece(Piece piece);
	
	boolean isEmpty();
	
	boolean isNotEmpty();

}
