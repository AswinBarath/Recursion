package Java_DSA_Bootcamp.Level_1_problems;

public class Q2_PrintNto1Then1ToN {

	public static void main(String[] args) {

		printNto1Then1ToN(5);

	}

	public static void printNto1Then1ToN(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNto1Then1ToN(n - 1);
		System.out.println(n);
	}

}
