package StairProblem;

public class StairImpl {
	// Fibonacci series
	public static int countStair(int n) {
String s="asas";
s.charAt(1);
		if (n <= 1) {
			return n;
		}
		int result = countStair(n - 1);
		int result2 = countStair(n - 2);

		return result + result2;
	}
	public static String reverse(String s ){
	    int length=s.length();
	String newString="";
	    for(int i =length-1;i>=0;i--){
	       newString+= s.charAt(i);
	    }
	    return newString;
	}
	public static void main(String[] args) {
		System.out.println(countStair(5 + 1));
		int n = 20;
		System.out.print("0 1 ");
		// fibonacci series
		for (int i = 1; i < n; i++) {
			System.out.print(countStair(i + 1) + " ");
		}
		System.out.println();
		System.out.println(
		reverse("abhc as, as"));
	}
}
