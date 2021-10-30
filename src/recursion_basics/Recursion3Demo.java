package recursion_basics;

public class Recursion3Demo {

	public static void main(String[] args) {
		// Print odd numbers in descending order followed even numbers in ascending order
		pdiskip(5);
	}

	public static void pdiskip(int n) {

		if (n == 0) {
			return;
		}

		if (n % 2 != 0) {
			System.out.println(n);
		}

		pdiskip(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}
	}
}
