package Recursion;

public class PrintAllCombination {
	static void print(String s , int n ,String result) {
		if(!result.isEmpty()) {
			System.out.println(result);
		}
		for(int i =n;i<s.length();i++) {
			char ch=s.charAt(i);
			print(s, i+1, result+ch);
		}
	}
	
	public static void print(String s ,String t) {
		
		if(s.isEmpty()) {
			System.out.println(t);
			return;
		}else {
			for(int i=0;i<s.length();i++) {
				
				char ch=s.charAt(i);
				String newString =s.substring(0,i)+s.substring(i+1);
				print(newString, ch+t);
			}
		}
	}
	public static void main(String[] args) {
		print("ABC","");
	}
}
