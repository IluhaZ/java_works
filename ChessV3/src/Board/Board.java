package Board;

import ChessExeptions.IllegalMoveExeption;
import Color.Color;
import GameState.GameState;
import Move.AbstractMove;

public interface Board {

	GameState makeMove(Color color, AbstractMove move) throws IllegalMoveExeption;
	
}
