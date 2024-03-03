package Scaler_recursion_problems;

// Implement Power Function
public class Power_of_N {
    public int pow(int A, int B, int C) {
        if (A == 0) return 0;
        if (B == 0) return 1;
        long ans = pow(A, B / 2, C) % C;
        ans = (ans * ans) % C;
        if (B % 2 == 1) {
            ans = (ans * A) % C;
        }
        ans = (ans + C) % C;
        return (int) ans;
    }
}

/*
line ||  code explanation
     || 
8    || long ans = pow(A,B/2,C) % C; 
     || => pow() is a very big No. 
     || => Hence taking "long ans" is very important
     || => (pow() % C) will always be 10^9 
     || => Hence "% C" is very important
     || 
9    || ans * ans = (10^18) => in worst case
     || => Hence (ans * ans) % C is very important
     || => Hence taking "long ans" is also very important
     || 
11   || When power is odd => (ans * A) => (10^18) => in worst case > (int)
     || => Hence (ans * A) % C is very important
     || => Hence taking "long ans" is also very important
     || 
13   || When base is -ve => (ans + C) 
     || => (2*10^9) => in worst case > (int)
     || => Hence (ans + C) % C is very important
     || => Hence taking "long ans" is also very important
     || 
*/