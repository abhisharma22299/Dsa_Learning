package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MajaorityElement {
// nums[]={1,3,2,5,1,3,1,5,1} find which element frequency is greater 
//then n/3  where n is the number of elements present in an array

	public static List<Integer> majaorityElement(int arr[]){
   int n=arr.length;
		HashMap<Integer,Integer> map=new HashMap<>();
		List<Integer> li=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}
			else {
				Integer f=map.get(arr[i]);
				map.put(arr[i], f+1);
			}
		}
   
		for(Map.Entry<Integer,Integer> e:map.entrySet())
		{
			if(e.getValue()>n/3)
				li.add(e.getKey());
			
		}
		
		System.out.println();
		System.out.println(map);
		
		return li;
	}
	public static void main(String[] args) {
		//int arr[]= {1,3,2,5,1,3,1,5,1};//
		int arr[]= {1,2};
		System.out.println(majaorityElement(arr));
		
		
	}
}
