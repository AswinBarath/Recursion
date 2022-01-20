package Java_DSA_Bootcamp.Level_1_problems;

public class Q6_ProductOfDigits {

	public static void main(String[] args) {

		System.out.println(productOfDigits(1342)); // 1 * 3 * 4 * 2 = 24 is the answer

	}
	
	public static int productOfDigits(int n) {
		// Base case
		if (n == 0) {
			return 1;
		}

		// Recursive case
		return (n % 10) * productOfDigits(n / 10);

		// F(n)= (n%10) * F(n/10) : Recurrence relation

	}

}
