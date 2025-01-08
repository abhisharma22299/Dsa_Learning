package Array;

import java.util.HashMap;

public class TwoSum {
	// target = 5;
	// 2 + 3 =5;
	
	
	public static void print(int arr[],int target) {
	
		HashMap<Integer,Integer> map=new HashMap<>();
		
		
		for(int i=0;i<arr.length;i++) {

			map.put(arr[i], i);
			int temp=  target- arr[i];
			if(map.containsKey(temp)) {
				System.out.print( arr[i] +" "+temp);
				break;
			}
		}
		
		
		
	}
	public static void main(String[] args) {

		int arr[]= {1,2,3,8};
		int target=5;
		print(arr,target);
	}
}
