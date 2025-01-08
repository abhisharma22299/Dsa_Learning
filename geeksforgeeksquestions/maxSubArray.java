package geeksforgeeksquestions;
// kaden's algorithm

public class maxSubArray {
public static void main(String[] args) {
	//int  nums[] = {-2,1,-3,4,-1,2,1,-5,4};
	int  nums[] = {-1,-14,-3,-2,-6,-12};
	int max=nums[0],sum=0,curSum=0;
	for(int i =0;i<nums.length;i++) {	
	curSum+=nums[i];
	if(curSum>max) {
		max=curSum;
	}
	if(curSum<0) {
		curSum=0;
	}
	}
	System.out.println(max);
}
}
