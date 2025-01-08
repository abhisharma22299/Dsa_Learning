package String;

public class ValidPalindrome {
	public static boolean valid(String str) {
		int i=0,j=str.length()-1;
		str=str.toLowerCase();
		while(i<j) {
			char chr1=str.charAt(i);
			char chr2=str.charAt(j);
			if(!(chr1>='a'&& chr1<='z'||chr1>='0'&&chr1<='9')) {
				i++;
				continue;
			}
			if(!(chr2>='a'&& chr2<='z'||chr2>='0'&&chr2<='9')) {
				j--;
				continue;				
			}
			if(chr1!=chr2) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {

		String str="ama ,ama";
		System.out.println(valid(str));
	}
}
