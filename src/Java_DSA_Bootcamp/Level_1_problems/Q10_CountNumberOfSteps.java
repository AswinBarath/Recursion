package Java_DSA_Bootcamp.Level_1_problems;

/*
 * Leetcode Problem: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */

public class Q10_CountNumberOfSteps {

	public static void main(String[] args) {

		System.out.println(numberOfSteps(14));

	}

	public static int numberOfSteps(int n) {
		return numberOfStepsHelper(n, 0);
	}

	public static int numberOfStepsHelper(int n, int steps) {
		if (n == 0) {
			return steps;
		}
		if (n % 2 == 0) {
			return numberOfStepsHelper(n / 2, steps + 1);
		}
		return numberOfStepsHelper(n - 1, steps + 1);
	}

}
