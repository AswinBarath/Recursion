package recursion_basics;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		System.out.println("Program to print power with base number and exponent");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base number");
		int base = scan.nextInt();
		System.out.println("Enter exponent");
		int exponent = scan.nextInt();
		System.out.println(pow(base, exponent));

		scan.close();
	}

	public static int pow(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int pnm1 = pow(x, n - 1);
		int pn = x * pnm1;

		return pn;
	}

}
