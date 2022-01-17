package Recursion;

public class R4_BacktrackPrint1toN {

	public static void backtrackPrint1toN(int i, int N) {
		if (i < 1) {
			return;
		}
		backtrackPrint1toN(i - 1, N);
		System.out.println(i);
	}

	public static void main(String[] args) {

		backtrackPrint1toN(10, 10); // Prints from 1 to 10

	}
}
