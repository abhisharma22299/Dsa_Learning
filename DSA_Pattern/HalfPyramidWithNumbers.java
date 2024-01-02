package DSA_Pattern;

import java.util.Scanner;

public class HalfPyramidWithNumbers {
	// main class
		public static void main(String args[]) {
		// printing the pattern of half pyramid with numbers
		// variable declaration the variables
		/*
		 1
		 1 2
		 1 2 3
 		 1 2 3 4
		 1 2 3 4 5
		   
		   */		
			int lines;
			System.out.println("Enter the number of line you want to print "
					+ "Stars Pattern");
			
			Scanner sc=new Scanner(System.in);
			    lines=sc.nextInt();
		System.out.println("Printing the pattern");
		System.out.println();
	  // outer loops	
		for(int i=1;i<=lines;i++) {
			// inner loops
           for(int j =1;j<=i;j++) {
        	   System.out.print(j + " ");
           }
           System.out.println();
		}
		
		}
		
}
