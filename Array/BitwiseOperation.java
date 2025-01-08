package Array;

import java.util.Arrays;

public class BitwiseOperation {
	
	
	public static void main(String[] args) {
		String str="0C1A1B1C1C1B0A0";
		int result=str.charAt(0)-'0';
//		System.out.println(result);
		for(int i=1;i<str.length();i+=2) {
			char operation=str.charAt(i+1);
			int nextDigit=str.charAt(i+1)-'0';
			switch (operation) {
			case 'A':
				result=result&nextDigit;
				break;
			
			case 'B':
				result=result | nextDigit; 
				break;
		
			case 'C':
				result= result^ nextDigit;
				break;
				
		}
		}
		
	System.out.println(result);
	}
	}
