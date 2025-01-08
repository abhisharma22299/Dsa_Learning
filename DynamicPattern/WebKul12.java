package DynamicPattern;

public class WebKul12 {

	private static void print(int n) {

		for (int i = 0; i < (n / 2) + 1; i++) {
			for (int j = 0; j < (n * 2) - 1; j++)
				System.out.print(" ");

			for (int j = 0; j < (n / 2) - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i) + 1; j++)
				System.out.print("*");

			System.out.println();
		}
		//
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < (n * 2) - 1; j++)
				System.out.print(" ");

			for (int j = 0; j <= n / 2; j++)

			{
				if (j == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

		//

		for (int i = 0; i < (n) + n / 2; i++) {
			System.out.print(" ");
		}
		//
		for (int i = 0; i < n; i++)
			System.out.print("*");

		System.out.println();

		for (int j = 0; j < 1; j++) {
			for (int i = 0; i < (n) + n / 2; i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

		//

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n / 2) + 1; j++) {
				if (j >= (n / 2) - i && j >= i - (n / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for (int j = 0; j < n; j++) {
				if (j == n - 1 && i < (n / 2) + 1) {
					System.out.print("*");
					break;

				}

				if (i == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}

	}

	public static void print2(int n) {

		//
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n + n + n; j++) {
				System.out.print(" ");
			}

			if (i != 0)
				System.out.print("e");
			System.out.println();

		}
		//
		for (int i = 0; i < (n / 2); i++) {

			for (int j = 0; j < n; j++)
				System.out.print(" ");

			for (int j = 0; j < (n / 2) - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i) + 1; j++)
				System.out.print("*");
			for (int j = 0; j < (n / 2) - i; j++)
				System.out.print(" ");
			for (int j = 0; j < n; j++)
				System.out.print(" ");
			System.out.print("e");

			System.out.println();

		}

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
		for (int i = 0; i < n; i++) {
			System.out.println("e");
		}

	}

	
	public static void main(String[] args) {
		 print(9);
		System.out.println();
	

	}

}
