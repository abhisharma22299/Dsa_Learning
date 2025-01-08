package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SingleNumber {

	/*
	 * Input: nums = [2,2,1] Output: 1
	 */

	public static int singleNumber(int nums[]) {

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
				return nums[i];
			}

		}
		System.out.println();
		return 0;
	}

	public static void singleNumber2(int[] nums) {

		int max = -1;
		for (int a : nums) {
			if (a > max)
				max = a;

		}

		int arr[] = new int[max + 1];

		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1)
				System.out.println(i);
		}
	}
	
	// using hash map 
	public static void singleNumber3(int nums[]) {
		
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		
		
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
			else {
				Integer d=map.get(nums[i]);
				map.put(nums[i],d+1 );
			}
		}
		System.out.println(map);
		for(Map.Entry<Integer, Integer>e:map.entrySet()) {
			if(e.getValue()==1) {
				System.out.println(e.getKey());
				return;
			}
			
		}
		System.out.println(map);
	}

	public static int singleNumber4(int[] nums) {
		int result = 0;
		int i = 0;
		for (int num : nums) {
			System.out.println("step " + i++ + " " + result + "=" + result + "^" + num + "=" + (num ^ result));
			result ^= num; // XOR all numbers
		}
		System.out.println(result);
		return result;
	}
	
	

	public static void main(String[] args) {
		int arr[] = { 2, 1, 1, 4, 2 };
		singleNumber3(arr);
	}
}
