package Recursion;

import java.util.Scanner;

public class R8_CheckStringPalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");

		String str = input.nextLine();

		System.out.println(isPalindrome(str));

		input.close();
	}

	public static boolean isPalindrome(String str) {
		return isPalindrome(str, 0);
	}

	public static boolean isPalindrome(String str, int i) {
		if (i >= str.length()) {
			return true;
		}
		if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
			return false;
		}
		return isPalindrome(str, i + 1);
	}

}
