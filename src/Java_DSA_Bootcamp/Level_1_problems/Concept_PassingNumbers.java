package Java_DSA_Bootcamp.Level_1_problems;

public class Concept_PassingNumbers {

	public static void main(String[] args) {

		concept_PassingNumbers(5);

	}

	public static void concept_PassingNumbers(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);

		// Stack Overflow!
//		concept_PassingNumbers(n--); // n-- will pass n first, then decrement
		// hence it infinitely passes n only

		concept_PassingNumbers(--n); // --n will decrement first, then pass n
		// hence healthy N to 1 Print output
	}

}
