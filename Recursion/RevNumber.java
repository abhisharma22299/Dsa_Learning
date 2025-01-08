package Recursion;

public class RevNumber {

	public static void main(String[] args) {
		int n = 1001;
		int rev = 0;

		rev(n, rev, 0);
	}

	private static void rev(int n, int rev, int sum) {
		if (n <=0) {

			System.out.println(sum);
			return;
		}
		int temp = n % 10;
		sum = (sum * 10) + temp;
		rev(n / 10, rev, sum);
	}

}
