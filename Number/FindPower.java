package Number;

public class FindPower {
	
	  public static int findPower(int a, int b) {
	  
	  if(b==1) { return a; } 
	  int result = a * findPower(a, b - 1);
	  return result; }
	 public static long findPowerWithOp(long a , long b) {
		 
		 if(b==1) {
		 
		 return a;
		 }
		 else {
			 long result=findPowerWithOp(a, b/2);
		
		 long finalResult=result*result;
		 
		 if(b%2==0) {
			 return finalResult;
		 }
		 else {
			 return a*finalResult;
		 }
	 }
	 }

	public static void main(String[] args) {

		System.out.println(findPowerWithOp(2, 62));
	}
}
