package SortingTechnique;

public class InsertionSort {
	public static void main(String args[]) {
		// program to bubble  sort the	
		// 7 8 3 1 2 //  7 3 1 2 8  //3 1 2 7 8 //  1 2 3 7 8
		// 0(n^2) time complexity
		// creating object of class printArray
		PrintArray pa=new PrintArray();
		 int[] arr= {8,7,3,1,2};
		 pa.arrayprint(arr);
		 System.out.println();
		 // InsertionSort
		 for (int i = 1 ; i<arr.length;i++) {
			 int current=arr[i];
			 int j=i-1;
			 while(j>=0 && current <arr[j] ) {
				 arr[j+1]=arr[j];
			     j--;
			 }
			 //placement
			 arr[j+1]=current;
			 pa.arrayprint(arr);
			 System.out.println();
		 }
		 System.out.print("Result : ");
		 pa.arrayprint(arr);
}
}