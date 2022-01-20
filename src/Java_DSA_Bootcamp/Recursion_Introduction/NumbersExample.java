package Java_DSA_Bootcamp.Recursion_Introduction;

public class NumbersExample {

	public static void main(String[] args) {
		// Write a function that takes in a number and prints it
		// print first 5 numbers: 1 2 3 4 5
		print1(1);
	}

	private static void print1(int i) {
		System.out.println(i);
		print2(2);
	}

	private static void print2(int i) {
		System.out.println(i);
		print3(3);
	}

	private static void print3(int i) {
		System.out.println(i);
		print4(4);
	}

	private static void print4(int i) {
		System.out.println(i);
		print5(5);
	}

	private static void print5(int i) {
		System.out.println(i);
	}

}
