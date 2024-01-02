package DSA_Pattern;

import java.util.Scanner;

public class HolloRectanglePattern {
	public static void main(String args[]) {
		// printing the pattern of half pyramid
		// variables declaration the variables
		int rows;
		int columns;
		System.out.println("Enter the rows of the rectange");
		Scanner sc=new Scanner(System.in);
		    rows=sc.nextInt();
		    System.out.println("Enter the columns of the rectange");
		    columns=sc.nextInt();
		 // outer loop
		    for(int i=1;i<=rows;i++) {
		    	
		    	// inner loop
		    	  for(int j=1;j<=columns;j++) {
	
		    		  if(i==1 || j== 1 || i==rows || j == columns ) {
		    			//printing the starts
		    			  System.out.print("* ");
		    		  }
		    		  else {
		    			//printing the escapes 
		    	   		  System.out.print("  ");
		    		  }
		    		 
		    	  }
		    	  System.out.println();
		    }
	}
}
