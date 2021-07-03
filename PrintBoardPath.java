package Recursion;

public class PrintBoardPath {

	public static void main(String[] args) {
		printBoardPath(0, 10, "");
	}
	
	public static void printBoardPath(int curr, int end, String ans) {
		
		// Positive Base Case
		if(curr == end ) {
			System.out.println(ans);
			return;
		}
		
		// Negative Base Case
		if(curr > end) {
			return;
		}
		
		// Recursive case
		for(int dice=1; dice<=6; dice++) {
			printBoardPath(curr+dice, end, ans+dice);
		}

	}
}