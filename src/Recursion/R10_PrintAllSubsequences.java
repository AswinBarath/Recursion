package Recursion;

import java.util.ArrayList;
import java.util.List;

/*
 * Time Complexity: O(2^n * n)
 * Space Complexity: O(n)
 */

public class R10_PrintAllSubsequences {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2 };
		int n = 3;
		List<Integer> ds = new ArrayList<>();
		printSubsequences(0, ds, arr, n);
	}

	public static void printSubsequences(int i, List<Integer> ds, int[] arr, int n) {

		if (i == n) {
			for (int num : ds) {
				System.out.print(num + ", ");
			}
			System.out.println();
			return;
		}

		ds.add(arr[i]);

		// pick
		printSubsequences(i + 1, ds, arr, n);

		ds.remove(ds.lastIndexOf(arr[i]));

		// don't pick
		printSubsequences(i + 1, ds, arr, n);

	}

}
