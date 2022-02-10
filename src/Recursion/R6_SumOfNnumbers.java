package Recursion;

import java.util.Scanner;

public class R6_SumOfNnumbers {

	public static void main(String[] args) {
		System.out.println("Enter N: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(sumOfNnumbers(1, num, 0));
		input.close();
	}

	public static int sumOfNnumbers(int i, int num, int sum) {
		if (i > num) {
			return sum;
		}
		sum += i + sumOfNnumbers(i + 1, num, sum);
		return sum;
	}

}
