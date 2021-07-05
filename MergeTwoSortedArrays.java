package Recursion;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int[] arr1 = new int[m];
		for(int i=0; i<m; i++) {
			arr1[i] = in.nextInt();
		}
		
		int n = in.nextInt();
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++) {
			arr2[i] = in.nextInt();
		}
		
		int[] merged = mergeTwoSortedArrays(m, arr1, n, arr2);
		
		for(int ele : merged) {
			System.out.print(ele + " ");
		}
		
		in.close();

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
