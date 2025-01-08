package Array;

public class LongestSubArrayWithSumAndWithKLEngth {
	
	public static void find(int arr[],int a) {
		int length=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<j;k++) {
					sum+=arr[k];
				}
				if(sum==a) {
					
					length=Math.max(length,j-i);
				}
			}
		}
		
		System.out.println(length);
		
		
	}
	public static void main(String[] args) {

		int arr[]= {1,1,2,1,1,-1,2,11};
		find(arr, 3);
	}
}
