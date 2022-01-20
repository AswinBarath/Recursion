package Java_DSA_Bootcamp.Level_1_problems;

public class Q8_Palindrome {

	public static void main(String[] args) {

		System.out.println("Is number Palindrome in Recursive method answer 1: " + palindromeRecursive1(54321));

		System.out.println("Is number Palindrome in Recursive method answer 2: " + palindromeRecursive1(54345));

	}

	public static boolean palindromeRecursive1(int n) {

		return n == Q7_ReverseNumber.reverseNumberRecursive2(n);

	}

}
