package AdvancedPattern;

import java.util.Scanner;

public class ButterflyPattern {
	// main class
	public static void main(String args[]) {
	// printing the pattern of half pyramid
		/*
		 
		  *             *
 		  * *         * *           
 		  * * *     * * *
		  * * * * * * * *
		  * * * * * * * *
		  * * *     * * *
		  * *         * *
		  *             *
		   	  
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
		for(int i=1;i<=lines;i++) {
			 // inner loop
			for(int j=1;j<=i;j++) {
				//printing the starts
				System.out.print("* ");
			
			}
			for(int j = 1 ;j<=2*(lines-i);j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//printing the new line
		System.out.println();	
		
		}
		
		
		// second loops
	//	System.out.println("second pattern");

	    // outer loop
			for(int i=lines;i>=1;i--) {
				 // inner loop
				for(int j=1;j<=i;j++) {
					//printing the starts
					System.out.print("* ");
				
				}
				for(int j = 1 ;j<=2*(lines-i);j++) {
					System.out.print("  ");
				}
				
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				//printing the new line
			System.out.println();	
			
			}
			

   }
}
