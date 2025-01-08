package Array;

public class FMinMaxNumber {

	// A class to store the minimum and maximum values
	static class Pair {
		int min;
		int max;
	}

	// Function to find the minimum and maximum in an array with minimum comparisons
	public static Pair findMinMax(int[] arr, int n) {
		Pair minMax = new Pair();

		// If there's only one element
		if (n == 1) {
			minMax.min = arr[0];
			minMax.max = arr[0];
			return minMax;
		}

		int i; // Loop iterator

		// Initialize min and max
		if (n % 2 == 0) {
			// If array has even number of elements
			if (arr[0] > arr[1]) {
				minMax.max = arr[0];
				minMax.min = arr[1];
			} else {
				minMax.max = arr[1];
				minMax.min = arr[0];
			}
			i = 2; // Set starting index for loop
		} else {
			// If array has odd number of elements, initialize with first element
			minMax.min = arr[0];
			minMax.max = arr[0];
			i = 1; // Set starting index for loop
		}

		// Iterate over pairs of elements
		while (i < n - 1) {
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > minMax.max) {
					minMax.max = arr[i];
				}
				if (arr[i + 1] < minMax.min) {
					minMax.min = arr[i + 1];
				}
			} else {
				if (arr[i + 1] > minMax.max) {
					minMax.max = arr[i + 1];
				}
				if (arr[i] < minMax.min) {
					minMax.min = arr[i];
				}
			}
			i += 2; // Increment index by 2 as we process two elements at a time
		}

		return minMax;
	}

	public static Pair findMinMax(int arr[]) {
    	int min=arr[0];
    	int max=arr[0];
    	for(int i=0;i<arr.length;i++) {
    	if(min>arr[i]) {
    		min=arr[i];
    	}
    	if(max<arr[i]) {
    		max=arr[i];
    	}
    	}
    	
    	System.out.println(min+" "+max );

    	Pair m=new Pair();
    	m.min=min;
    	m.max=max;
    	return m;
	}

	public static void main(String[] args) {
		int[] arr = { 1000, 11, 445, 1, 330, 3000 };
		int n = arr.length;
		Pair minMax = findMinMax(arr, n);
		System.out.println("Minimum element is " + minMax.min);
		System.out.println("Maximum element is " + minMax.max);
		minMax=findMinMax(arr);
		System.out.println("Minimum element is " + minMax.min);
		System.out.println("Maximum element is " + minMax.max);
	
	}
}
