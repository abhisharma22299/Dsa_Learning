package ArrayWithRecursion;

public class CheckArrayIsSortedOrNot {
public static int s=1;
	public static int Sorted(int arr[],int index) {
	  if(index==arr.length-1) {
		  return s;
	  }
		if(arr[index]>=arr[index+1]) {

		s=-1;
		return s;
		}
		
		Sorted(arr,index+1);
		return s;

	}
	public static void main(String[] args) {
		int arr[]= {1,1,3,4,5};
		
        System.out.print(Sorted(arr,0));;
	}

}
