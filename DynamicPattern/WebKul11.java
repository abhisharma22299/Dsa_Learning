package DynamicPattern;

public class WebKul11 {
	public static void print(int n) {

		for (int i = 0; i < (n / 2) + 1; i++) {

			for (int j = 0; j < (n / 2) + 1; j++)
				System.out.print(" ");

			for (int j = 0; j < (n / 2) - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i) + 1; j++)
				System.out.print("@");

			System.out.println();

		}
		
		//
		for (int i = 0; i < n ; i++) {

			for (int j = 0; j < (n / 2) + 1; j++)
				System.out.print(" ");
			
			System.out.print("@");
			for (int j = 0; j < n -2; j++)
				System.out.print(" ");
			System.out.print("@");
			System.out.println();
		}
//
		for (int i = 0; i < n ; i++) {
			
			
			for(int j=0;j<(n/2)+1;j++) { 
				if(j>=(n/2)-i && j>=i-(n/2))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			
			for(int j=0;j<n;j++) System.out.print(" ");
			
			for(int j=0;j<(n/2)+1;j++) { 
				if(j>=(n/2)-i && j>=i-(n/2))
					System.out.print("*");
			}
			
				System.out.println();
		}
		
		//
		
		
		for(int i=0;i<n;i++) {
			
			for (int j = 0; j < (n / 2) +2; j++)
				System.out.print(" ");
			for(int j=0;j<n-2;j++) System.out.print("*");
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		print(11);
	}
}
