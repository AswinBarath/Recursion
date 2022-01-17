package Recursion;

public class R3_LinearPrintNto1 {
	
	public static void linearPrintNto1(int i, int N) {
		if (i < 1) {
			return;
		}
		System.out.println(i);
		linearPrintNto1(i - 1, N);
	}

	public static void main(String[] args) {

		linearPrintNto1(10, 10); // Prints from 10 to 1
		
	}

}
