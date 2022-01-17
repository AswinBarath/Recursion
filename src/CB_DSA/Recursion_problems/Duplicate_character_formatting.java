package CB_DSA.Recursion_problems;

import java.util.Scanner;

public class Duplicate_character_formatting {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(duplicate_Character_Format(str, 0, str.length() - 1));
		in.close();
	}

	public static String duplicate_Character_Format(String str, int i, int l) {
		// Base Case
		if (i == l) {
			return str;
		}
		// Recursive Case
		String myResult;
		if (str.charAt(i) == str.charAt(i + 1)) {
			myResult = str.substring(0, i + 1) + "*" + str.substring(i + 1);
			myResult = duplicate_Character_Format(myResult, i + 2, l + 1);
			return myResult;
		}
		myResult = duplicate_Character_Format(str, i + 1, l);
		return myResult;
	}

}
