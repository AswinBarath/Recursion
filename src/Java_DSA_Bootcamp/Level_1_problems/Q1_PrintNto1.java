package Java_DSA_Bootcamp.Level_1_problems;

public class Q1_PrintNto1 {

	public static void main(String[] args) {
		printNto1(5);

	}

	static void printNto1(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNto1(n - 1);
		// Tail Recursion
	}

}
