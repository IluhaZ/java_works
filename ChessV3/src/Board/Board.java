package Board;

import ChessExeptions.IllegalMoveExeption;
import Color.Color;
import GameState.GameState;
import Move.IMove;

public interface Board {

	GameState makeMove(Color color, IMove move) throws IllegalMoveExeption;
	
}
