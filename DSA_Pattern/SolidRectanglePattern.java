package DSA_Pattern;

import java.util.Scanner;

public class SolidRectanglePattern {
public static void main(String args[]) {
	int lenght;
	int breath;
	System.out.println("Enter the length of the rectange");
	Scanner sc=new Scanner(System.in);
	    lenght=sc.nextInt();
	    System.out.println("Enter the breath of the rectange");
	    breath=sc.nextInt();
      
	      for(int i=0;i<breath;i++) {
	    	  for(int j=0;j<lenght;j++) {
    		 
    	  System.out.print("* ");
    	  }
    	  System.out.println();
      }
}
}
