package recursion.introduction;

public class NumbersExample {

	public static void main(String[] args) {
		// Write a function that takes in a number and prints it
		// print first 5 numbers: 1 2 3 4 5
		print1(1);
	}

	private static void print1(int i) {
		System.out.println(i);
		print2(i);
	}

	private static void print2(int i) {
		System.out.println(i);
		print3(i);
	}

	private static void print3(int i) {
		System.out.println(i);
		print4(i);
	}

	private static void print4(int i) {
		System.out.println(i);
		print5(i);
	}

	private static void print5(int i) {
		System.out.println(i);
	}

}
