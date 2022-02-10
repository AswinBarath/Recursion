package Java_DSA_Bootcamp.Array_Questions;

/*
 * Linear Search with Recursion
 */

public class Q2_LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int target = 4;
		int indexStart = 0;
		System.out.println(linearSearch(indexStart, target, arr));

	}

	public static boolean linearSearch(int idx, int target, int[] arr) {

		// Method 1
/*		
		// Base Case
		if (idx == arr.length) {
			return false;
			// Because no such index and target doesn't exist
		}

		// Recursive Case
		if (arr[idx] == target) {
			return true;
		}

		return linearSearch(idx + 1, target, arr);
*/
		// Method 2

		// Base Case
		if (idx == arr.length) {
			return false;
			// Because no such index and target doesn't exist
		}

		// Recursive Case
		return arr[idx] == target || linearSearch(idx + 1, target, arr);
		
	}

}
