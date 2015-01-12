package Move;

import Point.Point;

public class ChessMove extends AbstractMove{
	public Point pointSrc = new Point();
	public Point pointDst = new Point();
	public ChessMove(String str) throws IllegalArgumentException{
		move = str;
		pointSrc.column = move.charAt(0) -'a';
		pointSrc.line = move.charAt(1) - '0' - 1;
		pointDst.column = move.charAt(2) -'a';
		pointDst.line = move.charAt(3) - '0' - 1;
		if(checkValidity() == false){
			throw new IllegalArgumentException();
		}
	}
	
	private boolean checkValidity(){
		if(pointSrc.line < 0 || pointSrc.line > 7)
			return false;
		if(pointSrc.column < 0 || pointSrc.column > 7)
			return false;
		if(pointDst.line < 0 || pointDst.line > 7)
			return false;
		if(pointDst.column < 0 || pointDst.column > 7)
			return false;
		return true;
	}
	@Override
	public Point getPointSrc() {
		return pointSrc;
	}
	@Override
	public void setPointSrc(Point pointSrc) {
		this.pointSrc = pointSrc;
	}
	@Override
	public Point getPointDst() {
		return pointDst;
	}
	@Override
	public void setPointDst(Point pointDst) {
		this.pointDst = pointDst;
	}

	
	
}
