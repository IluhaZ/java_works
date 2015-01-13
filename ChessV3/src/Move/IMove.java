package Move;

import Point.Point;

public interface IMove {

	//public abstract String getMove();

	void setMove(Object move);
	 
	Point getPointSrc();

	void setPointSrc(Point pointSrc);

	Point getPointDst();

	void setPointDst(Point pointDst);

}