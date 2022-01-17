package CB_DSA.Recursion_basics;

public class Recursion2Demo {

	public static void main(String[] args) {
		// Print 1 to 5 in ascending order
		pi(5);
	}

	public static void pi(int n) {

		if (n == 0) {
			return;
		}

		pi(n - 1);
		System.out.println(n);
	}

}
