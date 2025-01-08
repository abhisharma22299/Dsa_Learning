package ArrayWithRecursion;

import java.util.ArrayList;
import java.util.List;

public class PrintPremutation {

	public static void backTrack(List<List<Integer>> result, List<Integer> temp, int nums[]) {

		if (temp.size() == nums.length) {
			result.add(new ArrayList<>(temp));
			return;
		}

		for (int i = 0; i < nums.length; i++) {

			if (temp.contains(nums[i]))
				continue;
			temp.add(nums[i]);
			backTrack(result, temp, nums);
		    temp.remove(temp.size()-1);
		
		}
	}


	public static void main(String[] args) {

		List<List<Integer>> result = new ArrayList();
		int nums[] = { 1, 2, 3 };
		help(result, new ArrayList<Integer>(), nums);
		System.out.println(result);

	}
public static void help(List<List<Integer>>res,List<Integer>temp,int nums[]){

	if(nums.length==temp.size()) {
		res.add(new ArrayList<>(temp));
		return;
	}
	for(int i=0;i<nums.length;i++) {
		if(temp.contains(nums[i])) {
			continue;
		}
		temp.add(nums[i]);
		help(res, temp, nums);
		temp.remove(temp.size()-1);
	}
}

}