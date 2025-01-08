package Array;

public class FindSingleUniqueElement {
	public static void main(String[] args) {
		int[] arr = { 1,1, 2, 2, 3, 5, 5 };

		System.out.println(findUnique(arr));
	}

	private static int findUnique(int[] arr) {

		int s = 0;
		int n = arr.length;
		int e = n - 1;

		if (n == 1) {
			System.out.println(arr[e - 1]);
			return arr[0];
		}
		while (s <= e) {
			
			int mid = (e + s) / 2;
			if (mid == 0 && arr[0] != arr[1])
				return arr[mid];
			if (mid == n - 1 && arr[n - 1] != arr[n - 2])
				return arr[mid];
			if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
				return arr[mid];
			if(mid%2==0) {//even case 
				if(arr[mid-1]==arr[mid])
					e=mid-1;
				else
					s=mid+1;
			}
			else {//odd
				if(arr[mid-1] ==arr[mid])
					s=mid+1;
				else
					e=mid+1;
				
			}
			

		}
		return -1;
	}
}
