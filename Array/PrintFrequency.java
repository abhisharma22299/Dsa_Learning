package Array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class PrintFrequency {
	public  static void printFrequency(int arr[]) {

		LinkedHashMap<Integer ,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			
		if(!(map.containsKey(arr[i]))){
			map.put(arr[i], 1);
		}
		else {
			Integer a=map.get(arr[i]);
			a=a+1;
			map.put(arr[i], a);
		}
			
		}

	for(Map.Entry<Integer, Integer> e: map.entrySet()) {
		System.out.println(e.getKey()+" ocuurs "+e.getValue());
	}
		
	
	}
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 1, 2, 4, 1 };

		printFrequency(arr);
	}
}
