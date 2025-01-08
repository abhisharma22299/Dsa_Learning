package Array;

import java.util.Arrays;
import java.util.Stack;

public class Imp {
	public static void findMaxRightElemet(String[] args) {
		int[] arr = { 5, 7, 1, 7, 6, 0 };
		int[] res = new int[arr.length];
		res[res.length - 1] = -1;
		Stack<Integer> st = new Stack<>();
		st.push(arr[arr.length - 1]);

		for (int i = arr.length - 2; i >= 0; i--) {
			// Ensure the stack is not empty and remove smaller elements
			while (!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}

			// If stack is empty, no greater element exists
			if (st.isEmpty()) {
				res[i] = -1;
			} else {
				res[i] = st.peek();
			}

			// Push the current element onto the stack
			st.push(arr[i]);
		}

		// Print the result array
		for (int val : res) {
			System.out.print(val + " ");
		}
	}

	
	public static void maxSumArray(int arr[]) {
		int currSum = 0, maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			if (currSum < 0) {
				currSum = 0;
			}
			if (maxSum < currSum)
				maxSum = currSum;

		}
		System.out.println(maxSum);

	}

	public static void nearestDivisible(int num, int m) {
		// 67 8
		int i = num - 1;
		int j = num + 1;
		int temp = 0;
		int temp1 = 0;
		while (i > 0) {

			if (i % m == 0) {

				temp = i;
				break;
			}
			i--;
		}
		while (j != 0) {
			if (j % m == 0) {
				temp1 = j;
				break;
			}
			j++;
		}

		if ((num - temp) < temp1 - num)
			System.out.println(temp);
		else
			System.out.println(temp1);

	}

	public static void printMagicalNumber() {
		int n = 5;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int num = i;
			while (num > 0) {
				if ((num & 1) == 1) {
					sum += 2;
				} else {
					sum += 1;
				}

				num = num >> 1;
			}

			if (sum % 2 != 0)
				count++;

		}
		System.out.println(count);

	}

	public static void sumAllTheNumberCharacterInString() {
		String str = "a2b3";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		if(sum!=0) {
		System.out.println(sum);
	}
		else {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 1239, 0, 12, 49, 0, 1238, 12, 0, 3, 0, 3, 1, 0, 0, 0, 0, 12, 3 };
		// moveZerosToEnd(arr);
//			maxSumArray(arr);
//		nearestDivisible(67, 8);
		sumAllTheNumberCharacterInString();
	}
}
