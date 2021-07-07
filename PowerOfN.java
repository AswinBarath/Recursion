package Recursion;

import java.util.Scanner;

public class PowerOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		int n = in.nextInt();
		System.out.println(myPow(x, n));
		in.close();
	}
	
	// Iterative Solution
	public static double myPow(double x, int n) {
		double ans = 1.0;
		long nn = n;
		if(nn<0) nn = -1 * nn;
		while(nn > 0) {
			if(nn %2 == 1) {
				ans = ans * x;
				nn = nn - 1;
			}
			else { 
				x = x * x;
				nn = nn / 2;
			}
		}
		if(n<0) ans = (double)(1.0) / (double)(ans);
		return ans;
	}
	
	// Recursive Solution
//	public static double myPow(double x, int n) {
//        // Base case
//        if(n==0) {
//            return 1;
//        }
//        
//        // NEGATIVE EDGE CASE
//        if(n<0) {
//        	n = -1 * n;
//            return ( (double) 1 / (double) myPow(x, n) );
//        }        
//
//        //Recursive case 
//        double ans, nb2;
//    	nb2 = myPow(x, n/2);
//    	
//        if(n%2!=0) {
//            ans = nb2 * nb2 * x;
//        }
//        else {
//            ans = nb2 * nb2;
//        }
//                
//        return ans;
//        
//    }

}
