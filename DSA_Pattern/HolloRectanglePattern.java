package DSA_Pattern;

import java.util.Scanner;

public class HolloRectanglePattern {
	public static void main(String args[]) {
		int rows;
		int columns;
		System.out.println("Enter the rows of the rectange");
		Scanner sc=new Scanner(System.in);
		    rows=sc.nextInt();
		    System.out.println("Enter the columns of the rectange");
		    columns=sc.nextInt();
		    for(int i=1;i<=rows;i++) {
		    	
		    
		    	  for(int j=1;j<=columns;j++) {
	
		    		  if(i==1 || j== 1 || i==rows || j == columns ) {
		    			  System.out.print("* ");
		    		  }
		    		  else {
		    	   		  System.out.print("  ");
		    		  }
		    		 
		    	  }
		    	  System.out.println();
		    }
	}
}
