package sde_sheet;

import java.util.ArrayList;
import java.util.List;

public class CominationSum_I {

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;

		List<List<Integer>> answer = combinationSum(candidates, target);

		for (List<Integer> sub : answer) {
			for (int num : sub) {
				System.out.print(num + ", ");
			}
			System.out.println();
		}

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> answer = new ArrayList<>();
		combinationSum(candidates, target, 0, answer, new ArrayList<Integer>());
		return answer;
	}

	public static void combinationSum(int[] candidates, int target, int i, List<List<Integer>> answer,
			List<Integer> choices) {

		if (target == 0) {
			answer.add(choices);
			choices = new ArrayList<Integer>();
			return;
		}

		if (target < 0 || i >= candidates.length) {
			choices = new ArrayList<Integer>();
			return;
		}

		// pick
		choices.add(candidates[i]);
		combinationSum(candidates, target - candidates[i], i, answer, choices);

		// don't pick
//		choices.remove(choices.lastIndexOf(candidates[i]));
		combinationSum(candidates, target, i + 1, answer, choices);
	}

}
