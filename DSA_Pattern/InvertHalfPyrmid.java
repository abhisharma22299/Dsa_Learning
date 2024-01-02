package DSA_Pattern;

import java.util.Scanner;

public class InvertHalfPyrmid {
	
	// main class
	public static void main(String args[]) {
		// printing the pattern of inverted half  pyramid
		/*
		  
		          *
		        * *
		      * * *
		    * * * *
		  * * * * *
		  
		 */
		System.out.println("Printing the pattern");
		System.out.println();
		// variable declaration the variables
		int lines;
		System.out.println("Enter the number of line you want to print "
				+ "in Invernted half pyramid Pattern");
		Scanner sc=new Scanner(System.in);
		    lines=sc.nextInt();
		    
		 // outer loop
		for(int i=lines;i>0;i--) {
			// inner loop
			for(int j=0;j<i;j++) {
				System.out.print("*");
	}
			//printing the new line
		System.out.println();	
		
		}
   }
}
