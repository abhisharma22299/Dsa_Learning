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
	public static int countPathst( int arr[][],int i,int j,int n,int m) {
		if(arr[i][j]==1)     return 0;
		if(i==n || j ==m )   return 0;
		if(i==n-1 && j==m-1) return 1;
		
		int right=countPathst(arr, i+1, j, n, m);
		int down=countPathst(arr, i, j+1, n, m);
		return right+down;
	}
		
public static void main(String[] args) {
	int arr[][] ={{0,1},
			      {0,},
			           };
	System.out.println(countPathst(arr,0, 0,arr.length-1,arr[0].length-1));
//	System.out.println(countPaths(0, 0,3,3));
}
}
