package CB_DSA.Recursion_basics;

import java.util.Scanner;

//Program to find the upper bound value from sorted array with duplicates
public class LastIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Element to be searched:");
		int ele = sc.nextInt();

		System.out.println(lastIndex(arr, 0, ele));

		sc.close();

//		int[] arr = {6, 8, 1, 1, 8, 3, 4};
//		System.out.println(firstIndex(arr, 0, 8));

	}

	public static int lastIndex(int[] arr, int i, int ele) {
		if (i == arr.length) {
			return -1;
		}

		int index = lastIndex(arr, i + 1, ele);
		if (index == -1) {
			if (arr[i] == ele) {
				return i;
			} else {
				return -1;
			}
		} else {
			return index;
		}
	}

}
