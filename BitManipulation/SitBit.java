package BitManipulation;

public class SitBit {
	public static void main(String args[]) {
		// program to set a bit at place that 0 to 1 and 1 to 0 .
		
		int number =5;
		int position=1;
		int bitMask= 1<<position;
		int result = bitMask | number;
		 
		System.out.println(Integer.toBinaryString(result));  
	 

	}
}
