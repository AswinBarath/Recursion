package Recursion;

import java.util.Scanner;

public class R9_FibonacciNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		System.out.println(fibonacciNumber(num));
		input.close();
	}

	public static int fibonacciNumber(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
	}

}
