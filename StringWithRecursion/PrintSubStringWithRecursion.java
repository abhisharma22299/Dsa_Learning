package StringWithRecursion;

public class PrintSubStringWithRecursion {
	public static void printAllSubSequence(String str ,int index,String newString) {
		if(index==str.length()) {
			System.out.print("{"+newString+"}");
			return;
		}
		char currentChar=str.charAt(index);
		// to be 
		printAllSubSequence(str, index+1, newString+currentChar);
		// or not to be
		printAllSubSequence(str, index+1, newString);
	}
	
	public static void print(String s,String result) {
		if(s.isEmpty()) {
			System.out.println(result);
			return;
		}else {
			for(int i=0;i<s.length();i++) {
		char  ch= s.charAt(i);
		String newString=s.substring(0,i)+s.substring(i+1);
		print(newString, result+ch);
			
			}
		}
	}
	public static void print(String s,String result,int n) {
		if(!result.isEmpty()) {
			System.out.println(result);
		}
		for(int i=n;i<s.length();i++) {
			char ch=s.charAt(i);
			print(s,result+ch,i+1);
		}
		
	}
	
	// Main Function
	public static void main(String[] args) {
//		 time complexity O(2^n)
		System.out.print("{");
		printAllSubSequence("123", 0, "");// same 
	System.out.print("}");
	System.out.println();
	print("123","");
	System.out.println();
	print("123","",0);// same  
	}
	
	}

