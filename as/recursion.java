package as;

public class recursion {
	public static int re2(int x, int n) {
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		if(n%2==0) {
			return re2(x,n/2)*re2(x, n/2);
		}
		else {
			return re2(x, n/2)* re2(x, n/2)*x;
		}
	}
	public static int re(int x, int n) {
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		int power1 = re(x, n - 1);
		int pow = x * power1;
		return pow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(re2(2, 5));
		
	}

}
