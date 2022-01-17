package CB_DSA.Recursion_problems;

public class PrintMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMazePath(0, 0, 2, 2, "");
	}

	public static void printMazePath(int cr, int cc, int er, int ec, String ans) {

		// +ve Base Case
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		// -ve Base Case
		if (cr > er || cc > ec) {
			return;
		}

		printMazePath(cr, cc + 1, er, ec, ans + "H");
		printMazePath(cr + 1, cc, er, ec, ans + "V");
	}

}
