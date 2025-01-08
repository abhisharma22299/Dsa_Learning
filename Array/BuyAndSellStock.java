package Array;

public class BuyAndSellStock {
	 public static int findMin(int arr[],int i,int j){
	        int min=arr[i];
	        for(int k=i;k<j;k++){
		            if(min>arr[k]){
		                min=arr[k];
		            }
		        }
		        return min;
		    }
		 public static int findMax(int arr[],int i,int j){
		        int min=arr[i];
		        for(int k=i;k<j;k++){
		            if(min<arr[k]){
		                min=arr[k];
		            }
		        }
		        return min;
		    }
	 
	public static void main(String[] args) {

		int second=-1; 
		int arr[]= {2,4,1};
		int small=findMin(arr,0,arr.length);
	int i=0;
		for(;i<arr.length;i++) {
		if(arr[i]==small) 
			break;
	}
		if(i==arr.length-1) {
			System.out.println("no transacton");
			return;
		}
		else {
			second=findMax(arr,i+1,arr.length);
		}
		System.out.println(second-small);
	}
}
