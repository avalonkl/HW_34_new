package core;
import static org.junit.Assert.*; 
import org.junit.*;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.JVM) //(MethodSorters.DEFAULT) or (MethodSorters.NAME_ASCENDING)

public class TicTacToeTest {	

	@After public void after() {
		for (int a=0; a<9; a++) TicTacToe.board[a] = String.valueOf(a+1);
		}
	
	@Test public void test_null() {
		TicTacToe.turn = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";      
		assertEquals("Error", null, TicTacToe.checkWinner());
	      }
	
	@Test public void test_O_Incorrect() {
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		assertEquals("Error", "O", TicTacToe.checkWinner());
	      }
	
	@Test public void test_X_Incorrect() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		assertEquals("Error", "X", TicTacToe.checkWinner());
	      }
	
	@Test public void test_draw_01() { // 159287364
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "O";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "O";		
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "O";	
		TicTacToe.board[7] = "X";
		assertEquals("Error", "draw", TicTacToe.checkWinner());
	      }
	
	@Test public void test_X_Won_01() { // 14253
		TicTacToe.turn = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "O";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "O";
		TicTacToe.board[2] = "X";    
		assertEquals("Error", "X", TicTacToe.checkWinner());
	      }
	
	@Test public void test_O_Won_01() { // 14253
		TicTacToe.turn = "O";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "O";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "O";
		TicTacToe.board[2] = "X";    
		assertEquals("Error", "X", TicTacToe.checkWinner());
	      }
	
	@Test public void test_O_Won_02() { // 152347
		TicTacToe.turn = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "O";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "X";    
		TicTacToe.board[6] = "O";
		assertEquals("Error", "O", TicTacToe.checkWinner());
	      }
	
}