package Recursion;

public class PrintNQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		printNQueen(board, 0, "");
	}
	
	public static void printNQueen(boolean[][] board, int row, String result) {
		if(row==board.length ) {
			System.out.println(result);
			return;
		}
		
		for(int col=0; col<board[row].length; col++) {
			if(isItSafe(board, row, col)) {
				board[row][col] = true;
				printNQueen(board, row+1, result+"{"+(row+1)+"-"+(col+1)+"}");
				board[row][col] = false;
			}
		}
	}
	
	private static boolean isItSafe( boolean[][] board, int row, int col) {
		
		// Check the column for Queens
		for(int i=0; i<row; i++) {
			if(board[i][col]) {
				return false;
			}
		}
		
		// Check the Left Diagonal for Queens
		for(int i=row-1, j=col-1; (i>=0 && j>=0); i--, j--) {
			if(board[i][j]) {
				return false;
			}
		}
		
		// Check the Right Diagonal for Queens
		for(int i=row-1, j=col+1; (i>=0 && j<board.length); i--, j++) {
			// System.out.println("i=" + i + ",j=" + j);
			if(board[i][j]) {
				return false;
			}
		}
		
		return true;
	}

}
