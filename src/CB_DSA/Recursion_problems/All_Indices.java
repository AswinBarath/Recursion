package CB_DSA.Recursion_problems;

import java.util.Scanner;

public class All_Indices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the array length:");
		int n = input.nextInt();

		System.out.println("Enter the array elements:");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println("Enter the data to be searched:");
		int data = input.nextInt();

		int answer[] = allIndices(arr, 0, data, 0);

		System.out.println("The indices of the data: " + data + " is");
		for (int i : answer) {
			System.out.println(i);
		}

		input.close();
	}

	public static int[] allIndices(int[] arr, int i, int data, int count) {
		// Base case
		if (i == arr.length) {
			int[] base = new int[count];
			return base;
		}

		int[] allIndices = null;

		// Recursive case
		if (arr[i] == data) {
			allIndices = allIndices(arr, i + 1, data, count + 1);
		} else {
			allIndices = allIndices(arr, i + 1, data, count);
		}

		if (arr[i] == data) {
			allIndices[count] = i;
		}
		return allIndices;
	}

}
