package DynamicPattern;

public class AlgoCirrus3MaxOccurnceOfArrayElement {

	public static void printOccurance(int arr[] ){
		
		int max=-1;
		for(int i=0;i<arr.length;i++) {
			
			if(max<arr[i]) max=arr[i];
		}
		int print[]=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			print[arr[i]]++;
		}
		for(int i :print) {
			System.out.print(i+" ");
			
		}
		System.out.println();
          int 		max2=-1;
          int ind=-1;
		for(int i=0;i<arr.length;i++) {

			if(print[arr[i]] >max2 ) {
				ind=arr[i];
				max2=print[arr[i]];
			}
			
		}
			
		System.out.println(ind);
		
			
		}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,2,12,4,5,2,3,1,3,21,13,4,5,5};
		printOccurance(arr);
	}
}
