package ChessExeptions;

@SuppressWarnings("serial")
public class IllegalMoveWrongMove extends IllegalMoveExeption {

	public IllegalMoveWrongMove() {
	}

	public IllegalMoveWrongMove(String message) {
		super(message);
	}

}
