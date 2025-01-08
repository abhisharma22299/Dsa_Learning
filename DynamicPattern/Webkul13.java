package DynamicPattern;

public class Webkul13 {
	
	/*
	 
	 n=7
	                 eeeeee
     *               *
     *       *       *
     *       *       *
     *       *       *
     *eeeeeee*eeeeeee*
     *       *       *
     *       *       *
     *       *       *
     *               *
eeeeee
	 
	 
		*/
	
	public static void print(int n) {
		
		for(int i=0;i<1;i++) {
			
			for(int j=0;j<n-2;j++) {System.out.print(" ");}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) {System.out.print(" ");}
			System.out.print(" ");
			for(int j=0;j<n-1;j++) {System.out.print(" ");}
			System.out.print(" ");
			
			for(int j=0;j<n-1;j++) {System.out.print("e");}
			System.out.println();	
		}
		//
		
		for(int i=0;i<n+2;i++) {
			for(int j=0;j<n-2;j++)System.out.print(" ");
			System.out.print("*");
			
			
			for(int j=0;j<n;j++) {
				
			if(i==(n/2)+1) {
				System.out.print("e");
				
			}
			else {
				System.out.print(" ");
				
			}
			}
			
			if((i!=0)&& i<n+1 ) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++) {
				
				if(i==(n/2)+1) {
					System.out.print("e");
					
				}else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("*");
			System.out.println();
			
			
			
		}
		
		for(int i=0;i<n-1;i++) {
			System.out.print("e");
		}
		
	}
	public static void main(String[] args) {
		print(5);
	}
}
