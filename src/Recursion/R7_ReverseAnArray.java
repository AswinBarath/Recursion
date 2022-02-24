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

		reverseArrayTwoPointers(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		reverseArrayOnePointer(arr);
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		input.close();

	}

	public static void reverseArrayTwoPointers(int[] arr, int l, int r) {

		if (l >= r) {
			return;
		}

		swap(arr, l, r);

		reverseArrayTwoPointers(arr, l + 1, r - 1);

	}

	public static void reverseArrayOnePointer(int[] arr) {

		reverseArrayOnePointer(arr, 0, arr.length);
	}

	public static void reverseArrayOnePointer(int[] arr, int i, int n) {
		if (i >= n / 2) {
			return;
		}

		swap(arr, i, n - i - 1);

		reverseArrayOnePointer(arr, i + 1, n);

	}

	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
