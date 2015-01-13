package Behaviour;

import java.util.ArrayList;
import java.util.List;

import ChessExeptions.IllegalMoveDestination;
import Point.Point;

public class XBeh extends AbstractBehaviour{

	@Override
	public List<Point> getPath(Point src, Point dst) throws IllegalMoveDestination{
		
		if(Math.abs(src.line - dst.line) != Math.abs(src.column - dst.column))
			throw new IllegalMoveDestination();
		
		int dline;
		if(src.line > dst.line)
			dline = -1;
		else if (src.line < dst.line)
			dline = 1;
		else
			dline = 0;
		
		int dcolumn;
		if(src.column > dst.column)
			dcolumn = -1;
		else if (src.column < dst.column)
			dcolumn = 1;
		else
			dcolumn = 0;
		
		List<Point> ar = new ArrayList<Point>();
		Point currPoint = new Point(src);
		currPoint.MovePoint(dline,dcolumn);
		
		while(!currPoint.equals(dst)){
			ar.add(new Point(currPoint));
			currPoint.MovePoint(dline, dcolumn);
		}
		
		return ar;
	}
	
}
