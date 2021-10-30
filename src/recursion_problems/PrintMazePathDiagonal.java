package recursion_problems;

public class PrintMazePathDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMazePathDiagonal(0, 0, 2, 2, "");
	}

	public static void printMazePathDiagonal(int cr, int cc, int er, int ec, String ans) {

		// +ve Base Case
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		// -ve Base Case
		if (cr > er || cc > ec) {
			return;
		}

		printMazePathDiagonal(cr, cc + 1, er, ec, ans + "H");
		printMazePathDiagonal(cr + 1, cc, er, ec, ans + "V");
		printMazePathDiagonal(cr + 1, cc + 1, er, ec, ans + "D");
	}
}
