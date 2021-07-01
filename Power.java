package Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,5));

	}
	
	public static int pow(int x, int n) {
		
		if(n==0) {
			return 1;
		}
		
		int pnm1 = pow(x, n-1);
		int pn = x * pnm1;
		
		return pn;
	}

}
