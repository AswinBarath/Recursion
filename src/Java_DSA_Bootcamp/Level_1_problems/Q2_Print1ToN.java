package Java_DSA_Bootcamp.Level_1_problems;

public class Q2_Print1ToN {

	public static void main(String[] args) {

		print1ToN(5);

	}

	public static void print1ToN(int n) {
		if (n == 0) {
			return;
		}

		print1ToN(n - 1);

		System.out.println(n);

	}

}
