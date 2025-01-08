package DynamicPattern;

public class WebKulSet2 {
	/* set 1.6 
	 
		if n=2
		@
		@
		@** 
		  **@
		    @
		    @
		    
		    
		    
		    if n=3
		@
		@
		@
		@*** 
		   ***
		     ***@
		        @
		        @
		        @
	*/	
	
	public static void print(int n) {
		
		// printing the @
		for(int i=0;i<=n;i++)
		{
			System.out.print("@");
			if(i<n)
				System.out.println();
		}
		
		// printing  the star pattern
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n*i);j++)
			{
				System.out.print(" ");
			}
		
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			if(i==n-1)
				System.out.println("@");
			if(i!=n-1) 
			   System.out.println();
			
		
			}
		if(n==2) {
			
	       	for(int i=0;i<n;i++) {
	       		for(int j=0;j<n*n+1;j++) {
	       			if(j==n*n) {
		       			System.out.print("@");
	       			System.out.println();
	       			}
		       		else
			       		System.out.print(" ");
	       		}

	       	}
		}else {
				if(n%2==0) {
					for(int j=0;j<n;j++) {

						for(int i=0;i<=(n*n);i++)
						{
							if(i!=(n*n)) {
								System.out.print(" ");
							}else {
								System.out.print("@");
							}
						}
						System.out.println();
					}
					
					
				}else {
					
					for(int j=0;j<n;j++) {

						for(int i=0;i<=(n*n);i++)
						{
							if(i!=(n*n)) {
								System.out.print(" ");
							}else {
								System.out.print("@");
							}
						}
						System.out.println();
					}
				}
		}
		
		
			
				
			
			
			
	}
	
	
	
	public static void main(String[] args) {
		print(5);
	}
}
