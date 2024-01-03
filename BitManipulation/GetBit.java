package BitManipulation;

public class GetBit {
	// main class
		public static void main(String args[]) {
			// program for check binary places is zero or one 
			
			int binaryNumber =5 ;// 0101;
			int position=3;
			int bitMask=1 << position;
			if((bitMask & binaryNumber)==0) {
				System.out.println("Bit Was Zero");
				
			}
			else {
				System.out.println("Bit is one");
			}
		}
}
