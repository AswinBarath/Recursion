package Recursion;

import java.util.Scanner;

public class Remove_duplicates {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(remove_duplicates(str, 0, str.length() - 1));
		in.close();
    }

	public static String remove_duplicates(String str, int i, int l) {
		// Base Case
		if(i >= l) {
			return str;
		}
		// Recursive Case
		String myResult;
		if(str.charAt(i) == str.charAt(i+1)) {
			myResult = str.substring(0, i) + str.substring(i+1);
//			System.out.println(myResult + ", " + (i+1) + ", " + (l-1));
			myResult = remove_duplicates(myResult, i, l-1);
			return myResult;
		}
		myResult = remove_duplicates(str, i+1, l);
		return myResult;
	}

}
