package sde_sheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSums_I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				arr.add(sc.nextInt());
			}
			SubsetSumsSolution ob = new SubsetSumsSolution();

			ArrayList<Integer> ans = ob.subsetSums(arr, N);
			Collections.sort(ans);
			for (int sum : ans) {
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}

class SubsetSumsSolution {
	public void answer(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {

		// base case
		if (ind == N) {
			sumSubset.add(sum);
			return;
		}

		// pick (means add to sum)
		answer(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

		// Don't pick
		answer(ind + 1, sum, arr, N, sumSubset);
	}

	ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
		ArrayList<Integer> sumSubset = new ArrayList<>();
		answer(0, 0, arr, N, sumSubset);
		Collections.sort(sumSubset);
		return sumSubset;
	}
}
