package DynamicPattern;

public class WebkulSet1 {

	/*	
	
		if n=5 
		
		*
	   ***
	  *****
	  @   @
	  @   @
	  @   @
	  @ * @
	  @***@
	  *****	
		
	*/	
	
	public static void printPattern(int n) {
		
		
		for(int i=0;i<(n/2)+1;i++) {
			// print white space for praymid
	
			for(int j=0;j<(n/2)-i;j++)
			{
				System.out.print(" ");
			}

			// print stars for praymid
			
			for(int j=0;j<(2*i)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		// printing the second half
		
		for(int i=0;i<(n/2)+1;i++) {
			
			//print the @ 
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1)
					System.out.print("@");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			
			
		}
		
		// printing the third half 
		

		for(int i=0;i<(n/2)+1;i++) {
			// print white space for praymid
	
			for(int j=0;j<(n/2)-i;j++)
			{
				if(j==0)
					System.out.print("@");
				else
					System.out.print(" ");
			}

			// print stars for praymid
			
			for(int j=0;j<(2*i)+1;j++) {
				System.out.print("*");
			}
			
			
			for(int j=0;j<(n/2)-i;j++) {
				if(j==(n/2)-1-i)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.println();
			
			
		}
		
	}
	public static void main(String[] args) {

		printPattern(5);
	}
}
