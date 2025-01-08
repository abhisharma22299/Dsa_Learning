package as;

public class testt {

	public static void printpermutation(String str, String permutation) {

		if (0 == str.length()) {
			System.out.println(permutation);
			return;
		}

	for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String currStr = str.substring(0, i) + str.substring(i + 1);
			printpermutation(currStr, permutation + currStr);
		}

	}

	public static int printTotal(int i, int j, int n, int m) {
		if (i == n || j == m) {
			return 0;
		}
		if (i == n - 1 && j == m - 1) {
			return 1;
		}
		int downward = printTotal(i + 1, j, n, m);

		int right = printTotal(i, j + 1, n, m);
		return downward + right;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printpermutation("abc", "");
//		System.out.println(printTotal(0, 0, 3, 3));

	}
}
