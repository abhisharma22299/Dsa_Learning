package Number;

public class NumberConversion {
	public static long powerFunction2(int x, int pow) {
		if (pow == 0) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}
		long result = powerFunction2(x, pow - 1);
		long xp = x * result;
		return xp;
	}

	public static int reversal(int number) {

		int temp, sum = 0;
		int cout = 0;
		while (number > 0) {
			temp = number % 10;
			sum = (sum * 10) + (temp);
			cout++;
			number = number / 10;

		}
		return sum;
	}

	public static long[] numberToArray(long number) {
		int count = 0;
		System.out.println(number);
		long realNumber = number;

		while (number > 0) {
			count++;
			number = number / 10;

		}

		long arr[] = new long[count];
System.out.println(realNumber);
		for (int i = 0; i < count; i++) {
			long temp = realNumber % 10;
			arr[i] = temp;
			realNumber = realNumber / 10;
		}
		
		return arr;
	}

	public static int fact(int number) {
		if (number == 1) {
			return 1;
		}
		int facc = number * fact(number - 1);
		return facc;
	}
public static void printarr(long arr[]) {
	for(long a:arr) {
		System.out.print(a+" ");
	}
}
	public static long binaryToDecimal(long number) {
	//	number =reversal(number);
		long arr[]=numberToArray(number);
printarr(arr);
		long sum=0;
		for(int i=0;i<arr.length;i++) {
			
		arr[i]=arr[i]*powerFunction2(2, i);
		sum+=arr[i];
		}
		
		//System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		// reversal(123);
long arr[]=numberToArray(100);
printarr(arr);
	}
}
