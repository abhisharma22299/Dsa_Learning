package as;

public class asas {
public static void printPermutation(String str , String permutation) {
	if(str.length()==0) {	
		System.out.println(permutation);
		return;
	}

for (int i = 0; i < str.length(); i++) {
		char newChar=str.charAt(i);
		String newString =str.substring(0,i)+str.substring(i+1);
printPermutation(newString, permutation+newChar);
	}
}	
	public static void main(String[] args) {
		
	printPermutation("abc", "");	
	}
}
