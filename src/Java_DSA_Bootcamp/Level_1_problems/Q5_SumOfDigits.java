package Java_DSA_Bootcamp.Level_1_problems;

public class Q5_SumOfDigits {

	public static void main(String[] args) {

		System.out.println(sumOfDigits(1342)); // 1 + 3 + 4 + 2 = 10 is the answer

	}

	public static int sumOfDigits(int n) {
		// Base case
		if (n == 0) {
			return 0;
		}

		// Recursive case
		return (n % 10) + sumOfDigits(n / 10);

		// F(n)= (n%10) + F(n/10) : Recurrence relation

	}

}
