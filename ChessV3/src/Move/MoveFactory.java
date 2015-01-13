package Move;

public class MoveFactory implements IMoveFactory{

	@Override
	public IMove getMove(String gameType) {
		if(gameType == "chess")
			return new ChessMove();
		return null;
	}

}
