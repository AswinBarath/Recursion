package CB_DSA.Recursion_basics;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(4));

	}
	
	public static int fact(int n) {
		
		// Base Case
		if(n==1) {
			return 1;
		}
		
		int fmn1 = fact(n-1);
		int fn = n * fmn1;
		return fn;
	}

}
