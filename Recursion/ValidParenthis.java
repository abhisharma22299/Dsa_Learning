package Recursion;

public class ValidParenthis {

	public static void printBal(int n, int oc, int cc, String s) {
		if (oc == n && cc == n) {

			System.out.println(s);
			return;
		}

		if (oc < n) {
			printBal(n, oc + 1, cc, s + "(");
		}
		
		if (oc > cc) {
			printBal(n, oc, cc + 1, s + ")");
		}
		}
	
	public static void main(String[] args) {
		printBal(2, 0, 0, "");
	}
}
