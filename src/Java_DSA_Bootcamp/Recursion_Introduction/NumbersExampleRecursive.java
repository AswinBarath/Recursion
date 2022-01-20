package Java_DSA_Bootcamp.Recursion_Introduction;

public class NumbersExampleRecursive {

	public static void main(String[] args) {
		print(1);
	}

	private static void print(int i) {
		// base condition
		if (i == 5) {
			System.out.println(5);
			return;
		}

		System.out.println(i);

		// recursive call
		// if you are calling again and again, you can treat it as a separate call in
		// the stack

		// This is the last function call in the last statement
		// This is a Tail Recursion
		print(i + 1);
	}
}
