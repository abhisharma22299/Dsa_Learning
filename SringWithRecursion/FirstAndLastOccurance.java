package SringWithRecursion;

public class FirstAndLastOccurance {
	public static void printOcc(String str,int index, int first,int last,String findChar) {
		String findLowerCase=findChar.toLowerCase();
		String findUpperCase=findChar.toUpperCase();
		if(index==str.length()-1) {
			if(str.charAt(index) == 'a' || str.charAt(index)=='A') {
				if(first==-1) {
					first=index;
					
				}
				else {
					 last=index;
				}
			}
System.out.println("First Occurance At Index "+first+" and Last Occurance At Index "+last);
			return ;
		}
		
		
		
		if(str.charAt(index)=='a'|| str.charAt(index)=='A') {
			if(first==-1) {
				first=index;
				
			}
			else {
				 last=index;
			}
		}
		printOcc(str, index+1, first, last, findChar);
	}
	public static void main(String[] args) {
		String as="Abhishek SHarmA";
		String findarr= "a";
		printOcc(as, 0, -1, -1, findarr);
	}
}
