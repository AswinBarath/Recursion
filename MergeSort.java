package Recursion;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {20, 10, 30, 50, 60, 5, 80, 25};
		int[] res = mergeSort(arr, 0, arr.length-1);
		for(int ele : res) {
			System.out.print(ele + " ");
		}
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		
		// Base case
		if(lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		
		int mid = (lo + hi) / 2;
		// Recursive case
		int[] firstHalf = mergeSort(arr, lo, mid);
		int[] secondHalf = mergeSort(arr, mid+1, hi);
		
		int[] merged = mergeTwoSortedArrays(firstHalf.length, firstHalf, secondHalf.length, secondHalf);
		
		return merged;
	}
	
	public static int[] mergeTwoSortedArrays(int m, int[] arr1, int n, int[] arr2) {
		
		int[] merged = new int[m+n];
		int i=0, j=0, k=0;
		while(i < m && j < n) {
			if(arr1[i] <= arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;
			} else {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		if(i == m) {
			while(j < n) {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		if(j == n) {
			while(i < m) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}
		return merged;
	}


}
