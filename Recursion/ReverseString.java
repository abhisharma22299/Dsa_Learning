package Recursion;

public class ReverseString {

	public static void rev(String s,int n,String rev) {
		if(n<0) {
			System.out.println(rev);
			return ;
		}
		char ch=s.charAt(n);
		rev(s,n-1,rev+ch);
	}
	
	public static void main(String[] args) {
		String str="ABC";
		rev(str,str.length()-1,"");
	}
}
