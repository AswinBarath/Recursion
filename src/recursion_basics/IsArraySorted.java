package recursion_basics;

public class IsArraySorted {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 9 };
		System.out.println(isSorted(arr, 0));
	}

	public static boolean isSorted(int[] arr, int i) {

		if (arr.length == i + 1) {
			return true;
		}

		if (arr[i] > arr[i + 1]) {
			return false;
		} else {
			boolean restAns = isSorted(arr, i + 1);
			return restAns;
		}
	}
}
