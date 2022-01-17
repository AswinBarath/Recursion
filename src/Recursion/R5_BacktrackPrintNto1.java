package Recursion;

public class R5_BacktrackPrintNto1 {

	public static void backtrackPrintNto1(int i, int N) {
		if (i > N) {
			return;
		}
		backtrackPrintNto1(i + 1, N);
		System.out.println(i);
	}

	public static void main(String[] args) {

		backtrackPrintNto1(1, 10); // Prints 10 to 1

	}
}
