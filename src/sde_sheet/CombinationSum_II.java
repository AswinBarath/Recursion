package sde_sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum_II {

	public static void main(String[] args) {
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		Arrays.sort(candidates);

//		Set<List<Integer>> answer = findCombinationsBruteForce(candidates, target);
		List<List<Integer>> answer = findCombinations(candidates, target);

		for (List<Integer> sub : answer) {
			System.out.println(sub);
		}

	}

	public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
		/*
		 * Time Complexity: O(2^n * k) 
		 * where n is the no. of combinations where k is the
		 * number of times we save answer in a ds
		 * 
		 * Space Complexity: O(k * x) 
		 * where k is the average length of the combination
		 * where x is the number of combinations
		 */
		if (target == 0) {
			ans.add(new ArrayList<>(ds)); // O(n)
			return;
		}

		for (int i = ind; i < arr.length; i++) {
			if (i > ind && arr[i - 1] == arr[i])
				continue;
			if (arr[i] > target)
				break;
			ds.add(arr[i]);
			findCombinations(i + 1, arr, target - arr[i], ans, ds);
			ds.remove(ds.size() - 1);
		}
	}

	public static List<List<Integer>> findCombinations(int[] candidates, int target) {
		List<List<Integer>> answer = new ArrayList<>();
		findCombinations(0, candidates, target, answer, new ArrayList<Integer>());
		return answer;
	}

	public static void findCombinationsBruteForce(int ind, int[] arr, int target, Set<List<Integer>> ans,
			List<Integer> ds) {
		/*
		 * Time Complexity: O(2^t * k) 
		 * where t is the no. of recursive calls for
		 * unlimited no. of choice of given array ele where k is the number of times we
		 * save answer in a ds
		 * 
		 * Space Complexity: O(k * x) 
		 * where k is the average length of the combination
		 * where x is the number of combinations
		 */
		if (ind == arr.length) {
			if (target == 0) {
				ans.add(new ArrayList<>(ds)); // O(n)
			}
			return;
		}

		if (arr[ind] <= target) {
			ds.add(arr[ind]);
			findCombinationsBruteForce(ind + 1, arr, target - arr[ind], ans, ds);
			ds.remove(ds.size() - 1);
		}
		findCombinationsBruteForce(ind + 1, arr, target, ans, ds);
	}

	public static Set<List<Integer>> findCombinationsBruteForce(int[] candidates, int target) {
		Set<List<Integer>> answer = new HashSet<>();
		findCombinationsBruteForce(0, candidates, target, answer, new ArrayList<Integer>());
		return answer;
	}
}
