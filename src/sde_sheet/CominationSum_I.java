package sde_sheet;

import java.util.ArrayList;
import java.util.List;

/*
 * Time Complexity: O(2^t * k)
 * where t is the no. of recursive calls for unlimited no. of choice of given array ele 
 * where k is the number of times we save answer in a ds
 * 
 * Space Complexity: O(k * x)
 * where k is the average length of the combination
 * where x is the number of combinations
 */

public class CominationSum_I {

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;

		List<List<Integer>> answer = findCombinations(candidates, target);

		for (List<Integer> sub : answer) {
			System.out.println(sub);
		}

	}

	public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
		if (ind == arr.length) {
			if (target == 0) {
				ans.add(new ArrayList<>(ds)); // O(n)
			}
			return;
		}

		if (arr[ind] <= target) {
			ds.add(arr[ind]);
			findCombinations(ind, arr, target - arr[ind], ans, ds);
			ds.remove(ds.size() - 1);
		}
		findCombinations(ind + 1, arr, target, ans, ds);
	}

	public static List<List<Integer>> findCombinations(int[] candidates, int target) {
		List<List<Integer>> answer = new ArrayList<>();
		findCombinations(0, candidates, target, answer, new ArrayList<Integer>());
		return answer;
	}
}
