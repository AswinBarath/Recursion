package Java_DSA_Bootcamp.Array_Questions;

/*
 * Find if the given array is sorted or not using Recursion
 */

public class Q1_IsArraySorted {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(isArraySorted(arr, 0));

	}

	public static boolean isArraySorted(int[] arr, int idx) {

		// Method 1
/*		
		// Base Case
		if (idx + 1 == arr.length) {
			return true;
		}

		// Recursive case
		if (arr[idx] < arr[idx + 1]) {
			return isArraySorted(arr, idx + 1);
		}

		return false;
*/		
		// Method 2

		// Base Case
		if (idx == arr.length - 1) {
			return true;
		}

		// Recursive case
		return arr[idx] < arr[idx + 1] && isArraySorted(arr, idx + 1);

	}

}
