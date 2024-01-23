package Backtracking;

public class PrintPermutationThroughBackreacking {
	
	
	// time complexity n*n! 
	 public static void printPermutation(String str,String Permutaion,int index) {
	if(str.length()==0) {
		System.out.println(Permutaion);
		return;
	}
		 
		 for(int i=0;i<str.length();i++) {
		char currentChar=str.charAt(i);
		String newString=str.substring(0,i)+str.substring(i+1);
		printPermutation(newString, Permutaion+currentChar, index+1);
		
	}
		
	}

	public static void main(String[] args) {

	//	printPermutation("ABC","",0);
	//printPattern();
	}



}
