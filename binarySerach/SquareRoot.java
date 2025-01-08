package binarySerach;

public class SquareRoot {
	
	public static  int findSquareRoot(int n) {
		int result=-1,high=n,low=0;
// modified binary search 
			while(low<=high) {
				int mid=low+(high-low)/2;
				long val=mid*mid;
				if(val==n) {
					return mid;
				}
				else if(val<n) {
					//store the floor value ,in case the number is not perfect square root
					result=mid;
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
		
		return result;
	}
	public static void main(String[] args) {
int result=findSquareRoot(144);
System.out.println(result);
	}
}
