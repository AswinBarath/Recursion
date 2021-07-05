package Recursion;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {20, 10, 30, 50, 60, 5, 80, 25};
	quickSort(arr, 0, arr.length-1);
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
	
	public static void quickSort(int[] arr, int lo, int hi) {
		
		// Base case
		if(lo >= hi) {
			return;
		}
		
		// Recursive case
		// 1. Partitioning
		int mid = (lo+hi) / 2;
		int pivot = arr[mid];
		
		int left = lo;
		int right = hi;
		
		while(left <= right) {
			
			while(arr[left] < pivot) {
				left++;
			}
			
			while(arr[right] > pivot) {
				right--;
			}
			
			if(left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			left++;
			right--;
		}
		
		// 2. Sort both halves (Smaller problems)
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
		
	}

}
