package geeksforgeeksquestions;

public class reverseAnArray {
	public static void main(String[] args) {
 int arr[]= {5,4,3,2,1,0};

 for(int i=0, j=arr.length-1;i<j;i++,j--) {
	 int temp=arr[i];
	 arr[i]=arr[j];
	 arr[j]=temp;
 }
	String str=	arr.toString();
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}
}
