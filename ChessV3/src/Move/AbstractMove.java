package Move;

import Point.Point;

public abstract class AbstractMove {
	
	protected String move;
	
	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	public abstract Point getPointSrc();

	public abstract void setPointSrc(Point pointSrc);

	public abstract Point getPointDst() ;

	public abstract void setPointDst(Point pointDst);
}
