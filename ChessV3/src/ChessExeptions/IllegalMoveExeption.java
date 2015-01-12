package ChessExeptions;

@SuppressWarnings("serial")
public class IllegalMoveExeption extends Exception {
	public IllegalMoveExeption() {
		super();
	}
	public IllegalMoveExeption(String message){
		super(message);
	}
}
