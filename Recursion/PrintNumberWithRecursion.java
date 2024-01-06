package Recursion;

public class PrintNumberWithRecursion {
	public static void recursion(int number ) {
		if(number ==0) {
			return;
		}
		System.out.println(number);
		recursion(number-1);
	}
		

	
	// main class
			public static void main(String args[]) {
			// printing the number with recursion
			recursion(5);	
				
}
}