package ChessExeptions;

@SuppressWarnings("serial")
public class IllegalMovePathNotFree extends IllegalMoveExeption {
	
	public IllegalMovePathNotFree() {
		super();
	}
	
	public IllegalMovePathNotFree(String message) {
		super(message);
	} 
}
