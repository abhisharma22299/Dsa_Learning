package as;

public class ArmstrongNumberStartEnd {
	static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}
public static int digitSum(int i) {
	int temp=0;
	int sum=0;
	while(i>0) {
		temp=i%10;
		sum+=temp;
		i=i/10;
	}
	return sum;
}
	public static void main(String[] args) {
		int start = 10;
		int end = 1000;
int sum=0;
		for(int i=start;i<end;i++) {
			if(isArmstrong(i)) {
				System.out.print(i+ " ");
			sum+=digitSum(i);	
			}
		}
		System.out.println();
	System.out.println(sum);
	}
	
}
