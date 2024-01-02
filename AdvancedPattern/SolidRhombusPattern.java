package AdvancedPattern;

import java.util.Scanner;

public class SolidRhombusPattern {
	// main files
	public static void main(String args[]) {
		// printing the pattern of solid rhombus
				/*
				 
				  *****
				 ***** 
				*****
			   *****
			  *****   	  
				 
				 */
		// variable declaration the variables
		
		
				int lines;
				
				System.out.println("Enter the number of line you want to print "
						+ "Stars Pattern");
				
				Scanner sc=new Scanner(System.in);
				    lines=sc.nextInt();
				    System.out.println("Printing the pattern");
					System.out.println();
					// outer loops
					for(int i=lines;i>=1;i--) {
						// inner loop
						for(int k = i-1;k>=1;k--) {
							System.out.print("  ");
							
						}
						// inner loop printing the stars 
						for (int j=	1;j<=5;j++) {
							System.out.print("* ");
							
						}
						System.out.println();
					}
		
	}
}
