package Recursion;

public class PowerOfNumberWithRecursion {
        public static int  pow(int x,int pow ) {
        if(pow==0) { // base case 1
        	
        	return 1; 
        }
        if(x==0) {// base case 2
       	return 0;
        }
        	
        int result=pow(x,pow-1); // rest working	
        int xP=x*result;
        return xP;
        }
        
        
        public static int pow2(int x,int n) {
        	
        	if(x==0)return 0;
        	if(n==0)return 1;
        	int result=pow2(x,n-1);
        	int xp=result*x;
        	return xp;
        }
	public static void main(String[] args) {
		//  Program To Find Power Of Number With Recursion
	System.out.println(pow2(2,5));
	}

}
