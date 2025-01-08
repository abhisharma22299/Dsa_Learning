package TwoDArray;

public class PrefixSum {

	
	
	public static void main(String[] args) {
int arr[][]= {{1, 2,   3,  4  } ,
			  {5, 6,   7,  8    },
			  {9,10,  11,  12},
			  {13,14, 15,  16}};


int firstStar,secondStart,firstEnd,secondEnd;
int r1=0;
int r2=1;
int c1=3;
int c2=3;
int sum=0;
for(int i=r1;i<=c1;i++) {	
	for(int j=r2;j<=c2;j++) {
		System.out.println(arr[i][j]+" " +i+" "+ j  );
		sum+=arr[i][j];
	}
}
	
	
	
	System.out.println(sum);
	}
}
