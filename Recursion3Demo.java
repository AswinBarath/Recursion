package Recursion;

public class Recursion3Demo {

	public static void main(String[] args) {
//		pdi(5);
		pdiskip(5);
	}
	
	public static void pdi(int n) {

		if(n==0) {
			return;
		}

		System.out.println(n);
		pdi(n-1);
		System.out.println(n);
	}

	public static void pdiskip(int n) {

		if(n==0) {
			return;
		}

		if(n%2!=0) {
			System.out.println(n);
		}
		
		pdiskip(n-1);
		
		if(n%2==0) {
			System.out.println(n);
		}
	}
}
