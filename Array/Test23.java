package Array;

public class Test23 {

	public static boolean isPrime(int num) {
		int test = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				test++;
			}
		}

		if (test == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 7,13,5 };
		int prime=0;
		int complex=0;
		int pN=0;
		int cN=0;
		for (int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) {
				pN=arr[i];
				prime++;
			}
			else {
				cN=arr[i];
				complex++;
			}

		}
		if(prime==1) {
			System.out.println(pN);
			return;
		}else {
			System.out.println(cN);
		}
		

	}
}
