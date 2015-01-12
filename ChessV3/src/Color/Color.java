package Color;

public enum Color {
	WHITE,
	BLACK ,
	NOCOLOR;
	public static Color oposite(Color color){
		if(color == WHITE)
			return BLACK;
		if(color == BLACK)
			return WHITE;
		return color;
	}
}
