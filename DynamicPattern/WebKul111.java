package DynamicPattern;

public class WebKul111 {
	public static void print3(int n) {

		//
		for (int i = 0; i <= n + n / 2; i++) {

			for (int j = 0; j < n + n + n; j++) {
				System.out.print(" ");
			}

			if (i != 0)
				System.out.print("e");
			System.out.println();

		}
		//

		//
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < n; j++)
				System.out.print("e");
			for (int j = 0; j < n; j++)
				System.out.print("*");

			for (int j = 0; j <= n; j++)
				System.out.print("e");
			System.out.println();
		}
		//
		for (int i = (n / 2)-1; i >= 0; i--) {

			
			System.out.print("e");

			for (int j = 0; j < n - 1; j++)
				System.out.print(" ");

			for (int j = 0; j < (n / 2) - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i) + 1; j++)
				System.out.print("*");
			for (int j = 0; j < (n / 2) - i; j++)
				System.out.print(" ");
			for (int j = 0; j < n; j++)
				System.out.print(" ");

			System.out.println();

		}
		for (int i = 0; i <= n / 2; i++)
			System.out.println("e");

	}
public static void main(String[] args) {
	print3(5);
}
}
