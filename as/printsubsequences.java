/*
 * 
 * import java.util.HashSet;
 */

package as;
import java.util.HashSet;

public class printsubsequences {
  
public static void print(String s,String result,int n) {
	if(!result.isEmpty()) {
		System.out.println(result);
	}
	for(int i=n;i<s.length();i++) {
		char ch=s.charAt(i);
		print(s, result+ch, i+1);
		
	}
}
public static int pow(int x,int n) {
	if(x==0)return 0;
	if(n==0)return 1;
	
	int result=pow(x,n-1);
	int xp=result*x;
	return xp;
	
	
}
public static long pow2(int x,int n) {
	if(x==0)return 0;
	if(n==0)return 1;
	
	if(n%2==0) {
		return pow2(x,n/2) *pow2(x,n/2);
	}
	else {
		return pow2(x,n/2) *pow2(x,n/2)*x;
	}
	
	
}
  public static void main(String[] args) {
	  print("abc","",0);
 System.out.println(pow2(3000,5));
  }
  }
 