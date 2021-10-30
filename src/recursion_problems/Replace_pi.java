package recursion_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Replace_pi {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<String> str = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			str.add(in.next());
		}
//			System.out.println(replace_pi(str));
		ArrayList<String> result = replace_pi(str);
		for (String s : result) {
			System.out.println(s);
		}
		in.close();
	}

	public static ArrayList<String> replace_pi(ArrayList<String> str) {

		ArrayList<String> myRes = new ArrayList<>();

		for (String val : str) {
			myRes.add(replace_pi(val, 0, val.length() - 1));
		}

		return myRes;

	}

	public static String replace_pi(String str, int i, int l) {
		// Base Case
		if (i >= l) {
			return str;
		}
//			if(i>0 && str.charAt(i) == 'x') {
//				return str;
//			}
		// Recursive Case
		try {
			String curr = str.substring(i, i + 2);
			String myResult;
			if (curr.equals("pi")) {
				myResult = str.substring(0, i) + "3.14" + str.substring(i + 2);
				myResult = replace_pi(myResult, i + 4, l + 4);
				return myResult;
			}
			myResult = replace_pi(str, i + 1, l);
			return myResult;
		} catch (StringIndexOutOfBoundsException e) {
			return str;
		}
	}
}
