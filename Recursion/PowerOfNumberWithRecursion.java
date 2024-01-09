package Recursion;

public class PowerOfNumberWithRecursion {
        public static int  powerFunction(int x,int pow ) {
        if(pow==0) { // base case 1
        	
        	return 1; 
        }
        if(x==0) {// base case 2
        	return 0;
        }
        	
        int result=powerFunction(x,pow-1); // rest working	
        int xP=x*result;
        return xP;
        }
	public static void main(String[] args) {
		//  Program To Find Power Of Number With Recursion
	System.out.println(powerFunction(2,5));
	}

}
