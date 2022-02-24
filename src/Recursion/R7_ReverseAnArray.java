package Recursion;

import java.util.Scanner;

/*
 * Reverse array using Two pointers
 */

public class R7_ReverseAnArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the array size: ");

		int n = input.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the array elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		reverseArray(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		input.close();

	}

	public static void reverseArray(int[] arr, int l, int r) {

		if (l >= r) {
			return;
		}

		swap(arr, l, r);

		reverseArray(arr, l + 1, r - 1);

	}

	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
