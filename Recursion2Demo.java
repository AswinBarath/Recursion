package Recursion;

public class Recursion2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pi(5);
	}

	public static void pi(int n) {
		
		if(n==0) {
			return;
		}

		pi(n-1);
		System.out.println(n);
	}

}
