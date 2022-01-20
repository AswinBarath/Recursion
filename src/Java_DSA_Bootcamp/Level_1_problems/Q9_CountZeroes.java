package Java_DSA_Bootcamp.Level_1_problems;

// Count number of zeroes in a number

public class Q9_CountZeroes {

	public static void main(String[] args) {

		System.out.println(countZeroes(20304));

	}

	public static int countZeroes(int n) {
		return countZeroes(n, 0);
	}

	public static int countZeroes(int n, int count) {
		if (n == 0) {
			return count;
		}
		if (n % 10 == 0) {
			return countZeroes(n / 10, count + 1);
		}

		return countZeroes(n / 10, count);

	}
}
