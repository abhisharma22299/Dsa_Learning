package DynamicPattern;

public class WebKul5 {
/*
 
  *	   *
 **     **
***********
 **     **
  *     *
	 
	 
	*/

	public static void print(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<(n/2)+1;j++) {
				if(j>=(n/2)-i && j>= i-(n/2))
					System.out.print("*");
					else
						System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if(i==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<(n/2)+1;j++) {
				if(j>=(n/2)-i && j>= i-(n/2))
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		print(5);
	}
}
