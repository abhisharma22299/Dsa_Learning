package SortingTechnique;
 class PrintArray{
public static  void arrayprint(int arr[]) {	
	for (int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}

public class BubbleSorting {
	public static void main(String args[]) {
		// program to bubble  sort the	
		// 7 8 3 1 2 //  7 3 1 2 8  //3 1 2 7 8 //  1 2 3 7 8
		// 0(n^2) time complexity
		// creating object of class printArray
		PrintArray pa=new PrintArray();
		 int[] arr= {8,7,3,1,2};
		 pa.arrayprint(arr);
		 System.out.println();
		 // BubbleSort
		 for (int i=0;i<arr.length;i++ ) {
			
			 for(int j=0;j<arr.length-1-i;j++) {
				 if(arr[j]>arr[j+1]) {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
				 
				pa.arrayprint(arr);
				
			System.out.println();
			 }
		 }
		 
		 pa.arrayprint(arr);
	}

	
}
