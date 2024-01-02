package AdvancedPattern;

import java.util.Scanner;

public class PalindromicPatter {
	// main class
			public static void main(String args[]) {
			// printing the pattern of half pyramid
				/*
				 
				   
				  * * * * 1 * * * *  
				  * * * 2 1 2 * * *  
				  * * 3 2 1 2 3 * *  
				  * 4 3 2 1 2 3 4 *  
				  5 4 3 2 1 2 3 4 5        1
				         	  
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
				// inner loop printing the escapes		
				for(int j=lines-i ;j>=1;j--) {
					System.out.print("  ");		
				}
				
				// print the fist half
				for(int j=i;j>=1;j--) {
			System.out.print(j+" ");
			
				}
				// print the second half
				for(int j=2;j<=i;j++) {
					System.out.print(j+" ");
				}
				// new line
				System.out.println();
			}
		
			}
}
