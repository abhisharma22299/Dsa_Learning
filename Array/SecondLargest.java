package Array;

public class SecondLargest {
	public static int secondLargest(int arr[]) {
		int max = arr[0];
		int second = arr[0];
		int f=-1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		for (int j = 1; j < arr.length; j++) {
			if(arr[j]==max)
			{ 
				System.out.println(0);
				continue;
			}
			if ( arr[j] > second ) {
				System.out.println(1);
				second = arr[j];
			f=1;
			}
		}
		if(f==-1) { return -1;
		}
		
		else { return second;
		}
		}

	public static void main(String[] args) {
		int[] arr = {10,5,10};
		System.out.println(secondLargest(arr));
	}
}
