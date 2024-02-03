package LinkedList;

public class test {
	
	public static void print(int n)
	{
		for(int i=1;i<=n;i++) {
			
				
				for(int k=1;k<=n-i;k++) {
					System.out.print(" ");
					
				}
//			  *
//			 ***
//			***** 
//		   *******
//		  *********
				for(int k=1;k<=(2*i)-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		
		
		//
		for(int i=n;i>=1;i--) {
			
			
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
				
			}

			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	
	}
		
	
	public static void main(String[] args) {

		print(9);
	}
}
