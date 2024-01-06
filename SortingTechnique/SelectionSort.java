package SortingTechnique;

public class SelectionSort {
	public static void main(String args[]) {
		
		// program for selection sort 
		// in this sort only one iteration perform per iteration of 
		// inner loop 
		// creating object of class printArray
		// time complexity O(n^2)
				PrintArray pa=new PrintArray();
				 int[] arr= {8,7,3,1,2};
				 pa.arrayprint(arr);
				 System.out.println();
		// selection sort
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[smallest]>arr[j]) {
					smallest=j;
				     
				}
				
				
			}

			int tempVariable=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=tempVariable;
			pa.arrayprint(arr);
			System.out.println();
		}
		System.out.print("Result : ");
		pa.arrayprint(arr);
	}
}
