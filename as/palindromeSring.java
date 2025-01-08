package as;
class Solution {
	 
    public static String isPalin(String e){
        String d="";
        
        for(int i = e.length()-1; i>=0;i--){
d  = d + e.charAt(i);
        }
        return d;
    }
    public boolean isPalindrome(String s) {
        String d=isPalin(s);
        if(d.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}
public class palindromeSring {
	public static String revString(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution sc=new Solution();
	//	System.out.println(sc.isPalindrome("ama"));;
String rev=revString("ama");
String str="amaa";
if(str.equals(rev)) {
	System.out.println("valid palindrome");
}
else {
	System.out.println("Invalid Palindrome");
}

	}

}
