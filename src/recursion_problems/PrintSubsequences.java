package recursion_problems;

public class PrintSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubsequences("abc", "");
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
