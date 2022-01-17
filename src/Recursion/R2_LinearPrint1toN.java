package Recursion;

public class R2_LinearPrint1toN {

	public static void linearPrint1toN(int i, int N) {
		if (i > N) {
			return;
		}
		System.out.println(i);
		linearPrint1toN(i + 1, N);
	}

	public static void main(String[] args) {

		linearPrint1toN(1, 10); // Prints 1 to 10

	}

}
