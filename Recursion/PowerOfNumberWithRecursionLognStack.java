package Recursion;

public class PowerOfNumberWithRecursionLognStack {
    public static int  powerFunction(int x,int pow ) {
        if(pow==0) { // base case 1
        	
        	return 1; 
        }
        if(x==0) {// base case 2
        	return 0;
        }
        // if power is even 
        if(pow%2==0) {	
        	return powerFunction(x,pow/2)*powerFunction(x,pow/2);
        }
     // if power is odd
        else {
        	return powerFunction(x,pow/2)*powerFunction(x,pow/2)*x	;
        }
        
        }
	public static void main(String[] args) {
		//  Program To Find Power Of Number With Recursion with logn stack
	System.out.println(powerFunction(	5,0 ));
	}


}
