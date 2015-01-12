package Point;

public class Point {
	public int line;
	public int column;
	
	public Point(int line, int column) {
		this.line = line;
		this.column = column;
	}

	public Point(Point point) {
		line = point.line;
		column = point.column;
	}
	
	public void MovePoint(int dline, int dcolumn) {
		line += dline;
		column += dcolumn;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + line;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (column != other.column)
			return false;
		if (line != other.line)
			return false;
		return true;
	}
	
}
