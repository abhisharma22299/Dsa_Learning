package DynamicPattern;

public class Webkul10 {
 
	/* if n=5;
	 
	   @@@@@ 
	    @@@
	     @
	 *****
	 *   *
	 *   *
	 *   *
	 *   *
	 
	 */
	public static void print(int n) {

		// printing thr blank prymid

		for (int i = (n / 2) + 1, k = 0; i >= 0; i--, k++) {

			for (int j = 0; j < (n / 2) + k; j++) {
				System.out.print(" ");

			}

			for (int j = (2 * i) + 1; j > 0; j--) {
				System.out.print("@");
			}
			System.out.println();

		}
		// second part

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n + 1; j++) {
				if (j == 1) {
					System.out.print(" ");
					continue;
				}
				if (i == 0 || j == n + 1 || j == 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		print(7);
	}
}
