package Java_DSA_Bootcamp.Level_1_problems;

public class Q4_SumOfNto1 {

	public static void main(String[] args) {

		System.out.println(sumOfNto1(10));

	}

	public static int sumOfNto1(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sumOfNto1(n - 1);
	}

}
