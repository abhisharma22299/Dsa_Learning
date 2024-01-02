package DSA_Pattern;

import java.util.Scanner;

public class InvertHalfPyrmid {
	public static void main(String args[]) {
		// printing the pattern of half pyramid
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
