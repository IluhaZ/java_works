package UniTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Board.Board;
import Board.ChessBoard;

public class TestBoard {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBoard1() {
		Board board = new ChessBoard();
		System.out.println(board);
	}

}
