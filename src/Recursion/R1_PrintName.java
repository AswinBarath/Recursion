package Recursion;

public class R1_PrintName {

	public static void printNameNtimes(String name, int n) {
		if (n == 0) {
			return;
		}
		System.out.println(name);
		printNameNtimes(name, n - 1);
	}

	public static void main(String[] args) {

		printNameNtimes("Aswin", 5); // Print Aswin 5 times

	}

}
