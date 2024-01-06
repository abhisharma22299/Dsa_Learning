package Recursion;

public class SumOfNaturalNumbers {
	public static void recursion(int number,int result  ) {
		
		if(number ==11) {
			System.out.println(result);
			return;
			
		}
		
		result+= number;
	       recursion(number+1,result);
	}
		

	
	// main class
			public static void main(String args[]) {
			// printing the sum of first 10 natural numbers with recursion
			recursion(1,0);	
			
}
}
