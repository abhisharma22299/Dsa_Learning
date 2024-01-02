package DSA_Pattern;

import java.util.Scanner;

public class EachLineStarPattern {
 
	public static void main(String args[]) {
	
		int lines;
		System.out.println("Enter the number of line you want to print "
				+ "Stars Pattern");
		Scanner sc=new Scanner(System.in);
		    lines=sc.nextInt();
		for(int i=0;i<lines;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			
		System.out.println();	
		
		}
   }
}
