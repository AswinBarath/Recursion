package Recursion;

import java.util.ArrayList;
import java.util.List;

public class R12_PrintOneSubsequenceWithSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };
		int n = 3;
		int sum = 2;
		List<Integer> ds = new ArrayList<>();
		System.out.println("Subsequence status: " + oneSubsequencesOfk(arr, n, sum, 0, 0, ds));

	}

	public static boolean oneSubsequencesOfk(int[] arr, int n, int sum, int i, int k, List<Integer> ds) {

		if (i == n) {
			// condition satisfied
			if (k == sum) {
				for (int sub : ds) {
					System.out.print(sub + ", ");
				}
				System.out.println();
				return true;
			}
			return false;
		}

		ds.add(arr[i]);

		// pick
		if (oneSubsequencesOfk(arr, n, sum, i + 1, k + arr[i], ds) == true)
			return true;
		ds.remove(ds.lastIndexOf(arr[i]));

		if (oneSubsequencesOfk(arr, n, sum, i + 1, k, ds) == true)
			return true;

		return false;
	}

}
