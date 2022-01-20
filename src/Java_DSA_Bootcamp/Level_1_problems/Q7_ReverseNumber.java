package Java_DSA_Bootcamp.Level_1_problems;

public class Q7_ReverseNumber {

	static int ans = 0;

	public static void main(String[] args) {

		System.out.println("Iterative answer: " + reverseNumberIterative(54321));

		reverseNumberRecursive1(54321);
		System.out.println("Recursive method 1 answer: " + ans);

		System.out.println("Recursive method 2 answer: " + reverseNumberRecursive2(54321));

		System.out.println("Recursive method 3 answer: " + reverseNumberRecursive3(54321));

	}

	public static int reverseNumberIterative(int n) {
		if (n == 0) {
			return 0;
		}
		int answer = 0;
		while (n > 0) {
			int rem = n % 10;
			answer = answer * 10 + rem;
			n = n / 10;
		}
		return answer;
	}

	// Method 1: Use static variable -> "ans" to reverse number

	public static void reverseNumberRecursive1(int n) {
		if (n == 0) {
			return;
		}

		int rem = n % 10;
		ans = (ans * 10) + rem;
		reverseNumberRecursive1(n / 10);

	}

	// Method 2: Use arguments to reverse number

	public static int reverseNumberRecursive2(int n) {
		return reverseNumberRecursive2(0, n);
	}

	public static int reverseNumberRecursive2(int answer, int n) {
		if (n == 0) {
			return answer;
		}
		int rem = n % 10;
		answer = (answer * 10) + rem;
		return reverseNumberRecursive2(answer, n / 10);

	}

	// Method 3: Use log and pow to calculate digit place to reverse number

	public static int reverseNumberRecursive3(int n) {

		int digits = (int) (Math.log10(n)) + 1;
		return reverseNumberRecursive3(n, digits);
	}

	public static int reverseNumberRecursive3(int n, int digits) {

		if (n % 10 == n) {
			return n;
		}

		int rem = n % 10;
		return rem * (int) (Math.pow(10, digits - 1)) + reverseNumberRecursive3(n / 10, digits - 1);
	}

}
