package CB_DSA.Recursion_problems;

import java.util.Scanner;

public class PrintSubsequences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printSubsequences(str, "");
		scan.close();
	}

	public static void printSubsequences(String str, String res) {

		// Base case
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSubsequences(ros, res);
		printSubsequences(ros, res + cc);

	}

}
