package recursion_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the string:");
		String str = in.next();

		ArrayList<String> answer = new ArrayList<>();
		answer = getSS(str);
		System.out.println("Subsequences: " + answer);
//		for(String s : answer) {
//			System.out.print(s + " ");
//		}
		in.close();

	}

	public static ArrayList<String> getSS(String str) {
		// Base case
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		// Recursive case
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recResult = getSS(ros);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		return myResult;
	}

}
