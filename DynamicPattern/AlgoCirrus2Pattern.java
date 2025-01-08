package DynamicPattern;

public class AlgoCirrus2Pattern {

	/*n=5
	 * 1
	 * 1 2
	 * 2 3 4 
	 * 4 5 6 7   
	 * 7 8 9 10 11 
	*/
	public static void print(int n) {
		
		int count =1;
		int temp=1;
		for(int i=1;i<=n;i++) {
			count =temp;
			for(int j=1;j<=i;j++) {
				System.out.print(count +" ");
			temp=count;
			count++;
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
print(9);
	}
}
