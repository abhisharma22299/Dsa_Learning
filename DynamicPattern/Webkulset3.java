package DynamicPattern;

public class Webkulset3 {

	/*
    @****
    @   ****
    @      ****
    @         ****@
    @             @
                  @
                  @
                  @
    

*/
public static void printPattern(int n){
  
  
  for(int i=0;i<n;i++){
      System.out.print("@");
      for(int j=0;j<(n-1)*i;j++) {System.out.print(" ");}
      for(int j=0;j<n;j++) {System.out.print("*");}
      if(i==n-1) System.out.print("@");
      System.out.println();
      
  }
  // part 2 
  
  int count=0;
for(int i=0;i<1;i++){
  System.out.print("@");
  for(int j=0;j<=((n-1)*n-1)+1  ;j++){
      System.out.print(" ");
      count++;
  }
  System.out.print("@");
  System.out.println();
}    
  // 
 for (int i=0;i<(n/2)+1;i++){
    for(int j=0;j<count+1;j++){
        System.out.print(" ");
    }  
    System.out.print("@");
    System.out.println();
  }
  
}

	public static void main(String[] args) {
		printPattern(5);
	}
}
