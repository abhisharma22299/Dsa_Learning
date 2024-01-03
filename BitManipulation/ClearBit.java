package BitManipulation;

public class ClearBit {
	public static void main(String args[]) {
		// program to change the particular bit to zero 
		// bit mask 1>>1
		// ~() Not
		//     And 
		
		int binaryNumber =5 ;// 0101;
		int position=2;
		int bitMask=1 << position;
		
		int notbitMask=~(bitMask);
		int result =notbitMask & binaryNumber;
		System.out.println(Integer.toBinaryString(result));
		
	}

}
