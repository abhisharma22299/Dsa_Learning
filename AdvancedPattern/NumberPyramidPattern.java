package AdvancedPattern;

import java.util.Scanner;

public class NumberPyramidPattern {
	// main class
		public static void main(String args[]) {
		// printing the pattern of half pyramid
			/*
			 
			   
			  * * * * 1 * * * * * 
			  * * * 2 * 2 * * * * 
			  * * 3 * 3 * 3 * * * 
			  * 4 * 4 * 4 * 4 * * 
			  5 * 5 * 5 * 5 * 5 *       1
			         	  
			 
			 
			 
			 */
			// variable declaration the variables
			
			
			int lines;
			
			System.out.println("Enter the number of line you want to print "
					+ "Stars Pattern");
			
			Scanner sc=new Scanner(System.in);
			    lines=sc.nextInt();
			    System.out.println("Printing the pattern");
				System.out.println();
				// outer loop
		for(int i = 1;i<=lines;i++) {
			// inner loop printing escapes
			for(int j=lines-i ;j>=1;j--) {
				System.out.print("  ");
				
			}
			// printing the element and  escape 
			for(int j=1;j<=i;j++) {
		System.out.print(i+"   ");
		
			}
			System.out.println();
		}
		}
}
