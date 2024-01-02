package DSA_Pattern;

import java.util.Scanner;

public class Trangle_0_1 {
	// main class
			public static void main(String args[]) {
			// printing the pattern of half pyramid with 0-1
				/*
				 
				  1
				  0  1
				  1  0  1
				  0  1  0  1
				  1  0  1  0  1 
				  0  1  0  1  0  1
	 			 
				  	  
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
					int sum =i+j;
						if(sum%2==0) {
						// even case
							System.out.print("1 ");
						}
						else {
							//odd case 
							System.out.print("0 ");
							
						}
						}
					//printing the new line
					System.out.println();	
					
		   }
}
}