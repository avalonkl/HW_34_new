package core;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TicTacToeTest2 {
	
	@Before
	public void initialize() {
		TicTacToe.board[0] = "1";
		TicTacToe.board[1] = "2";
		TicTacToe.board[2] = "3";
		TicTacToe.board[5] = "4";
		TicTacToe.board[3] = "5";
		TicTacToe.board[6] = "6";
		TicTacToe.board[4] = "7";
		TicTacToe.board[8] = "8";
		TicTacToe.board[7] = "9";
	}
	
	
	@Parameter(value = 0)
	public String turns;
	
	@Parameter(value = 1)
	public String expectedResult;

	@Parameters(name = "Iteration # {index}: Turns: {0}; ExpectedResult {1}")

	public static Collection<Object[]> TTT() {
		Object[][] data = new Object[][] {
			
				{  "159287364", "Draw"},
				{  "157439826", "Draw"},
				{  "157483296", "Draw"},
				{  "157964832", "Draw"},
				{  "136952748", "Draw"},
				//{  "14253", "X won"  },
				//{  "152347", "O won" }
				};
		
			return Arrays.asList(data);
	}

@Test
	public void testPrimeNumberChecker() {
	// System.out.println(TicTacToe.api(turns, true));
	assertEquals(expectedResult, TicTacToe.api(turns, false));
	
	}
}
