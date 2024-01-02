package DSA_Pattern;

import java.util.Scanner;

public class HalfPyramifRotated180Deg {
	// main class
		public static void main(String args[]) {
			// printing the pattern of half pyramid rotated 180 degree pyramid
			// variables declaration the variables
			int lines;
			
			System.out.println("Enter the number of line you want to print "
					+ "Stars Pattern");
			
			/*
			 _ _ _ _ *
			 _ _ _ * *
			 _ _ * * * 
			 _ * * * *
			 * * * * *
			  
			 */
			
			Scanner sc=new Scanner(System.in);
			    lines=sc.nextInt();
			    
			    System.out.println("Printing the pattern");
				System.out.println();
			    // outer loop
			for(int i=1;i<=lines;i++) {
				 // inner loop for printing escapes 
				for(int j=1 ; j<=lines-i ; j++) {
			System.out.print("  ");
			}
				// inner loop for printing the starts
				for(int j =1 ; j<=i;j++) {
					System.out.print("* ");
					
				}
				System.out.println();
		}
		
}
}