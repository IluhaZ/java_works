package Behaviour;

import java.util.ArrayList;
import java.util.List;

import ChessExeptions.IllegalMoveDestination;
import Point.Point;

public class HorseBeh extends AbstractBehaviour {

	@Override
	public List<Point> getPath(Point src, Point dst) throws IllegalMoveDestination{
		List<Point> ar = new ArrayList<Point>();
		if(src.line - 2 == dst.line){
			if(src.column - 1 == dst.column || src.column + 1 == dst.column)
				return ar;
		}
		if(src.line - 1 == dst.line){
			if(src.column - 2 == dst.column || src.column + 2 == dst.column)
				return ar;
		}
		if(src.line + 1 == dst.line){
			if(src.column - 2 == dst.column || src.column + 2 == dst.column)
				return ar;
		}
		if(src.line + 2 == dst.line){
			if(src.column - 1 == dst.column || src.column + 1 == dst.column)
				return ar;
		}
		throw new IllegalMoveDestination();
	}

}
