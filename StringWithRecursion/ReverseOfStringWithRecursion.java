package StringWithRecursion;

public class ReverseOfStringWithRecursion {
  public static void printRev(String str,int idx) {
	  if(idx==0) {
		  System.out.print(str.charAt(idx));
	  return;
	  }
	  System.out.print(str.charAt(idx));
  printRev(str, idx-1);
  }
	public static void main(String[] args) {
		// Program Reverse Of String With Recursion
		printRev( "ABCD",3);
	
	}

}
