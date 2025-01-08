package Array;
  public class DuplicateElement {
	public static void duplicates(int arr[] ){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) 	{
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);			
     		}
		}
	}
}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 42, 21, 8, 90, 90};
		duplicates(arr);
	}
}