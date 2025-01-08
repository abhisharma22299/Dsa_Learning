package DynamicPattern;

public class WebKul19 {
	/* if n=6;
	 * 
@
@
@
@******                         
@     ******                    
@          ******               @
@               ******          @
                     ******     @
                          ******@
                                @
                                @
                                @

	*/
	public static void print(int n) {
int count=0;
		// printing the first part 
		for(int i=0;i<n/2;i++) {
			System.out.println("@");
		}
		
		// second part 
		
		for(int i=0;i<n;i++) {
			
		if(i!=n-1 && i!=n-2)System.out.print("@");
		else  
			System.out.print(" ");
			
		for(int j=0;j<((n-1)*i);j++) { if(i==n-1) {
			count++;
		};System.out.print(" ");}
		for(int j=0;j<n;j++)System.out.print("*");
		for(int j=0;j<   (n-1)*(n-1)-((n-1)*i);j++) System.out.print(" ");
		if(i!=0&& i!=1) {
			System.out.print("@");
		}
		
		System.out.println();
		}
		
		// 

		for(int i=0;i<n/2;i++) {
			for(int j=0;j<=count+n;j++) {
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.println(); 
		}
	}

	public static void main(String[] args) {
		print(6);

	}
}
