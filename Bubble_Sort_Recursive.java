package Recursion;

import java.util.Scanner;

public class Bubble_Sort_Recursive {
	
	public static void display(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr, 0, arr.length-1);
		
		display(arr);
		
		sc.close();

	}
	
	public static void bubbleSort(int[] arr, int i, int l) {
		// Base case
		if(l==0) {
			return;
		}
		if(i == l) {
			bubbleSort(arr, 0, l-1);
			return;
		}
		
		if(arr[i] > arr[i+1]) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		bubbleSort(arr, i+1, l);
	}

}
