package DynamicPattern;

public class AlgoCirrus {

	/*
	 n=6;
	  * % * % * % 
      % * % * % * 
      * % * % * % 
	  % * % * % * 
	  * % * % * % 
	  % * % * % * 	  
	*/
	
	public static void print(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i+j)%2==0) {
					System.out.print("* ");
				}else {
					System.out.print("% ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		print(6);
		int arr[]= {1,2};
		String s="";
		s.split(s);
	}
}
