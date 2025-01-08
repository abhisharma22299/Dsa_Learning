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
    public static int Sorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return -1; // Array is not sorted
            }
        }
        return 1; // Array is sorted
    }
   public static void main(String[] args) {
		int arr[]= {1,2,4,5};
		
        System.out.print(Sorted(arr));;

	}

}
