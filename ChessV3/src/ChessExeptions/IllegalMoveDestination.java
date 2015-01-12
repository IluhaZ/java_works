package ChessExeptions;

@SuppressWarnings("serial")
public class IllegalMoveDestination extends IllegalMoveExeption {
	public IllegalMoveDestination() {
		super();
	}
	public IllegalMoveDestination(String message) {
		super(message);
	}
}
