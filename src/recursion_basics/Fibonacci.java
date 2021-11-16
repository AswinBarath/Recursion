package recursion_basics;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib(7));
	}

	public static int fib(int n) {

		// Base case
		if (n == 1) {
			return 1;
		}

		if (n == 0) {
			return 0;
		}

		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}
}
