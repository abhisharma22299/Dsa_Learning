package Array;

public class MoveZeroAtEnd {

	public static void atEndBruteforceApprocach(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			
			if(arr[i]==0)
			{
				for(int j=i;j<n-1;j++)
					arr[j]=arr[j+1];
				
				arr[n-1]=0;
				n--;
				i--;
			}
		}
		
		for(int a : arr)
			System.out.print(a+ " " );
		
		System.out.println();
		
	}
	
	public static void optimalApprocah(int arr[]) {
		
		int nonZeroIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
			{
				arr[nonZeroIndex++]=arr[i];	
			}
		}
		for(int i=nonZeroIndex;i<arr.length;i++)
			arr[i]=0;
		
		for(int a : arr)
			System.out.print(a+ " " );
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {1,0,21,0,14,0,1};
		atEndBruteforceApprocach(arr);
		optimalApprocah(arr);
	}
}
