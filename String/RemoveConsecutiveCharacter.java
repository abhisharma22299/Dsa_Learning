package String;

import java.util.ArrayList;

public class RemoveConsecutiveCharacter {
 
	public static String checkConsecutiveChar(String s) {
		String result="";
		int n=s.length();
		
		
		for(int i=0;i<n;i++) {
			if(i<n-1&&s.charAt(i)==s.charAt(i+1)) 
				continue;
			else 
				result=result+s.charAt(i);
			
		}
		return result;
		
	}
	
	public static void main(String[] args) {

		System.out.println(checkConsecutiveChar("aabbaabb"));
	}
}
