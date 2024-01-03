package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
	public static void main(String args[]) {
		// program to change the bit from 1 to 0 and 0 to 1 
		int binaryNumber =5 ;// 0101;
		int position=1;
		int bitMask=1 << position;
		int choice;
		System.out.println("Enter 1 For Updation Bit form 1 to 0 and ");
		System.out.println("Enter the 0 for Updating Bit From 0 to 1");
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		
		if(choice  == 1) {
			int notbitMask = ~(bitMask);
			int result = notbitMask & binaryNumber;
			System.out.println(Integer.toBinaryString(result));
			
		}
		else if (choice == 0) {
			int result = bitMask | binaryNumber;
			System.out.println("Result : " + Integer.toBinaryString(result));
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}