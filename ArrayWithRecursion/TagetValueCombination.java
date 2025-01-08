package ArrayWithRecursion;

import java.util.ArrayList;
import java.util.List;

public class TagetValueCombination {
// [2,2,5] target =8 output={[2,2,2,2],[2,3,3],[3,5]}
public static void 
backtrack(List<List<Integer>> result, List<Integer> temp, int candidates[], int target,int start)
{
		if (target < 0) {
			return;
		}
		else if (target == 0) {
			result.add(new ArrayList<>(temp));
		}
		for (int i = start; i < candidates.length; i++) {
			temp.add(candidates[i]);
			backtrack(result, temp, candidates, target - candidates[i], i);
			temp.remove(temp.size() - 1);
		}
	}
	public static void main(String[] args) {
		int candidates[] = { 2, 2, 5 };
		int target = 8;
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<Integer>(), candidates, target, 0);
		System.out.println(result);
	}
}
