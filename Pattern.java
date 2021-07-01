package Recursion;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the pattern:");
		int N = sc.nextInt();
		
		pattern(N, 1, 1);
		
		sc.close();

	}
	
	public static void pattern(int N, int row, int col) {
		// Base Case
		if(row>N) {
			return;
		}
		
		// Recursive Cases
		if(col>row) {
			System.out.println();
			pattern(N, row+1, 1);
			return;
		}
		
		System.out.print(";) ");
		pattern(N, row, col+1);
	}

}
