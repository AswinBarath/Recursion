package Java_DSA_Bootcamp.Easy_problems;

public class Nto1 {

	public static void main(String[] args) {
		fun(5);

	}

	static void fun(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		fun(n - 1);
	}

}
