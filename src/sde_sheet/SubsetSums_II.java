package sde_sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Time Complexity: O(2^n * n)
 * 2^n for number of recursive calls
 * n for storing the subsets in Array List
 * 
 * Space Complexity: O(2^n) * O(k)
 * 2^n - subsets size
 * k - average length of subset 
*/

public class SubsetSums_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			SubsetSums2Solution ob = new SubsetSums2Solution();

			List<List<Integer>> ans = ob.subsetSums2(arr, N);
			for (List<Integer> ls : ans) {
				System.out.println(ls);
			}
			System.out.println();
		}
		sc.close();
	}

}

class SubsetSums2Solution {
	public void answer(int ind, int[] arr, int N, List<Integer> ds, List<List<Integer>> subsets) {

		subsets.add(new ArrayList<>(ds));

		for (int i = ind; i < N; i++) {
			if (i > ind && arr[i] == arr[i - 1])
				continue;
			ds.add(arr[i]);
			answer(i + 1, arr, N, ds, subsets);
			ds.remove(ds.size() - 1);
		}
	}

	List<List<Integer>> subsetSums2(int[] arr, int N) {
		List<List<Integer>> subsets = new ArrayList<>();
		ArrayList<Integer> ds = new ArrayList<>();
		Arrays.sort(arr);
		answer(0, arr, N, ds, subsets);
		return subsets;
	}
}
