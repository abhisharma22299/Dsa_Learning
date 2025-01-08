package Recursion;

public class FibnoacciSeries {
private static void fibonacciSeries(int a , int b , int result,int i) {
		if(i==11) {
			return;
		}
		result=a+b;
		a=b;
		b=result;
		System.out.print(result+" ");
		fibonacciSeries(a,b,0,i+1);
	}
	public static void main(String[] args) {
		System.out.print(" 0 1 ");
		fibonacciSeries(0,1,0,3);	
	}
}
