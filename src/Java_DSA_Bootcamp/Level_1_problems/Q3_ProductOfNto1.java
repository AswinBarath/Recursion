package Java_DSA_Bootcamp.Level_1_problems;

public class Q3_ProductOfNto1 { // Factorial

	public static void main(String[] args) {

		System.out.println(productOfNto1(5));

	}

	public static int productOfNto1(int n) {
		if (n <= 1) {
			return 1;
		}

		return n * productOfNto1(n - 1);
	}

}
