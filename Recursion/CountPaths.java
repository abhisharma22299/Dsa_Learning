package Recursion;

public class CountPaths {
	public static int countPaths(int i,int j,int n,int m) {
		
		if(i==n || j==m) {
			return 0;
		}
		if(i==n-1 && j==m-1) {
			return 1;
		}
		int downwards=countPaths(i+1, j, n, m);
		int rightPaths=countPaths(i, j+1, n, m);
		
		
		return downwards+rightPaths;
		
	}
	
public static void main(String[] args) {
	System.out.println(countPaths(0, 0, 3, 3));
}
}
