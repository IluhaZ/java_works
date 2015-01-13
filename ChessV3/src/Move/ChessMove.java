package Move;

import Point.Point;

public class ChessMove implements IMove{
	public Point pointSrc;
	public Point pointDst;
	protected String move;
	
	public ChessMove() {
		pointSrc = new Point();
		pointDst = new Point();
	}
	
	@Override
	public void setMove(Object str) throws IllegalArgumentException{
		move = (String) str;
		strParsing();
		if(checkPointValidity(pointSrc) == false || checkPointValidity(pointDst) == false){
			throw new IllegalArgumentException();
		}
	}
	
	private void strParsing(){
		pointSrc.column = move.charAt(0) -'a';
		pointSrc.line = move.charAt(1) - '0' - 1;
		pointDst.column = move.charAt(2) -'a';
		pointDst.line = move.charAt(3) - '0' - 1;
	}
	
	private boolean checkPointValidity(Point point){
		if(point.line < 0 || pointSrc.line > 7)
			return false;
		if(point.column < 0 || pointSrc.column > 7)
			return false;
		return true;
	}
	
	@Override
	public Point getPointSrc() {
		return pointSrc;
	}
	
	@Override
	public void setPointSrc(Point pointSrc) {
		if(checkPointValidity(pointSrc) == false ){
			throw new IllegalArgumentException();
		}
		this.pointSrc = pointSrc;
	}
	
	@Override
	public Point getPointDst() {
		return pointDst;
	}
	
	@Override
	public void setPointDst(Point pointDst) {
		if(checkPointValidity(pointDst) == false ){
			throw new IllegalArgumentException();
		}
		this.pointDst = pointDst;
	}

	
}
