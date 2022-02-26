package Recursion;

import java.util.ArrayList;
import java.util.List;

public class R13_CountSubsequencesWithkSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 1, 2 };
		int n = 5;
		int sum = 2;
		int index = 0;
//		List<Integer> ds = new ArrayList<>();
//		int answer = subsequencesCount(index, sum, arr, n, ds, 0, 0);
		int answer = subsequencesCountSimpleCode(index, 0, sum, arr, n);
		System.out.println("The number of subsequences with sum-" + sum + " is: " + answer);

	}

	public static int subsequencesCount(int i, int s, int[] arr, int n, List<Integer> ds, int buf, int count) {

		if (i == n) {
			if (buf == s) {
				count++;
			}
			return count;
		}

		ds.add(arr[i]);
		buf += arr[i];

		// pick
		count = subsequencesCount(i + 1, s, arr, n, ds, buf, count);

		ds.remove(ds.lastIndexOf(arr[i]));
		buf -= arr[i];

		// don't pick
		count = subsequencesCount(i + 1, s, arr, n, ds, buf, count);

		return count;
	}

	public static int subsequencesCountSimpleCode(int i, int s, int sum, int[] arr, int n) {

		if (i == n) {
			if (s == sum) {
				return 1;
			}
			return 0;
		}

		s += arr[i];

		// pick
		int l = subsequencesCountSimpleCode(i + 1, s, sum, arr, n);

		s -= arr[i];

		// don't pick
		int r = subsequencesCountSimpleCode(i + 1, s, sum, arr, n);

		return l + r;
	}

}
