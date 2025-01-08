package Array;

public class BinaryToDecimalConvrsion {

	public static void main(String[] args) {
		int n=1010;
        int i=0;
        int result=0;
		while(n>0) {
		int temp=n%10;
		 result += (temp * Math.pow(2, i++));
			n=n/10;
		}
		System.out.println(result);
	}	
}
	