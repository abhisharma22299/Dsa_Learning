package DSA_Pattern;

import java.util.Scanner;

public class SolidRectanglePattern {
	// main class
public static void main(String args[]) {
	// printing the pattern of solid rectangle pyramid
	/*
	 
	 * * * * * 
	 * * * * * 
	 * * * * * 
	 * * * * * 
	 
	 */
		// variables declaration the variables
	int lenght;
	int breath;
	System.out.println("Enter the length of the rectange");
	Scanner sc=new Scanner(System.in);
	    lenght=sc.nextInt();
	    System.out.println("Enter the breath of the rectange");
	    breath=sc.nextInt();
	    System.out.println("Printing the pattern");
		System.out.println();
	 // outer loop
	      for(int i=0;i<breath;i++) {
	    	// inner loop
	    	  for(int j=0;j<lenght;j++) {
    		 
    	  System.out.print("* ");
    	  }
	    	//printing the new line
    	  System.out.println();
      }
}
}
