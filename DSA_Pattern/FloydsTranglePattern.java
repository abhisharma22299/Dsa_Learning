package DSA_Pattern;

import java.util.Scanner;

public class FloydsTranglePattern {
	// main class
		public static void main(String args[]) {
		// printing the pattern of half pyramid
			/*
			 
			  1
			  2  3
			  4  5  6
			  7  8  9  10
			  11 12 13 14 15 
			  15 17 18 19 20 21
 			 
			  	  
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
				int count =1;
			for(int i=1;i<=lines;i++) {
				 // inner loop
				for(int j=1;j<=i;j++) {
					
					//printing the starts
					System.out.print(count + " ");
					if(count<10) {
						System.out.print(" ");
					}
					count ++;
				}
				//printing the new line
			System.out.println();	
			
			}
	   }
}
