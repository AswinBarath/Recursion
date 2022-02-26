package Recursion;

import java.util.ArrayList;
import java.util.List;

public class R11_SubsequencesPrintPatterns {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1 };
		int n = 3;
		int sum = 2;
		List<Integer> ds = new ArrayList<>();
		subsequencesOfk(arr, n, sum, 0, 0, ds);

	}

	public static void subsequencesOfk(int[] arr, int n, int sum, int i, int k, List<Integer> ds) {

		if (i == n) {
			if (k == sum) {
				for (int sub : ds) {
					System.out.print(sub + ", ");
				}
				System.out.println();
			}
			return;
		}

		ds.add(arr[i]);

		// pick
		subsequencesOfk(arr, n, sum, i + 1, k + arr[i], ds);

		ds.remove(ds.lastIndexOf(arr[i]));

		subsequencesOfk(arr, n, sum, i + 1, k, ds);
	}

}
