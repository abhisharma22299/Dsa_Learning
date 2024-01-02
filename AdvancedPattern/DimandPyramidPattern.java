package AdvancedPattern;

import java.util.Scanner;

public class DimandPyramidPattern {
	// main class
				public static void main(String args[]) {
				// printing the pattern of half pyramid
					/*
					 
					   
					       *
					      ***
					     ***** 
					    *******
					   *********
					  ***********
					  ***********
					   *********
					    *******
					     *****
					      ***
					       *
					 
					 
					 
					 */
					// variable declaration the variables
					
					
					int lines;
					
					System.out.println("Enter the number of line you want to print "
							+ "Stars Pattern");
					
					Scanner sc=new Scanner(System.in);
					    lines=sc.nextInt();
					    System.out.println("Printing the pattern");
						System.out.println();
				
				// outer part
				for(int i = 1;i<=lines;i++) {
					// inner loop
					for(int j=lines-i ;j>=1;j--) {
						System.out.print("  ");
						
					}
					// inner loop printing the stars	
					for(int j=1;j<=2*i-1;j++) {
				System.out.print("* ");
				
					}
					// new line 
					System.out.println();
				}
				
				// second half
				
				for(int i = lines;i>=1;i--) {
					// inner loop
					for(int j=lines-i ;j>=1;j--) {
						System.out.print("  ");
						
					}
					// inner loop printing the stars	
					for(int j=1;j<=2*i-1;j++) {
				System.out.print("* ");
				
					}
					// new line 
					System.out.println();
				}
				}
}
