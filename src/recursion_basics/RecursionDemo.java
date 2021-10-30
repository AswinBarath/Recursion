package recursion_basics;

public class RecursionDemo {

	public static void main(String[] args) {
		// Print 1 to 5 in descending order
		pd(5);

	}

	public static void pd(int n) {

		if (n == 0) {
			return;
		}

		System.out.println(n);
		pd(n - 1);
	}

}
