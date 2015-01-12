package Behaviour;

import java.util.List;

import ChessExeptions.IllegalMoveDestination;
import Point.Point;

public abstract  class AbstractBehaviour {
	
	public abstract List<Point> getPath(Point src, Point dst) throws IllegalMoveDestination;
}
