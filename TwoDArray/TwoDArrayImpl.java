package TwoDArray;

public class TwoDArrayImpl {
	public static void printTwoDArray(int arr[][]) {
		System.out.println("*****************");
		
		for(int[]mat:arr) {
			for(int m:mat) {
				if(m<10) {
					System.out.print(" ");
				}
				System.out.print(m+"   ");
			}
			System.out.println();
		}	
		System.out.println("*****************");
	}
	public static int[][]rotation(int arr[][]) {
		int m=arr.length;
		int n=arr[0].length;
		// step 1 transpose of 2 d matrix
			for(int i=0;i<m;i++) {
				for(int j=i;j<n;j++) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
					//System.out.println(arr[i][j]);
				}
				
			}
			printTwoDArray(arr);
			
			// rotation of two d matrix  
			for(int i=0;i<m;i++) {
				int li=0;
				int ri=n-1;
				while(li<ri) {
					int temp=arr[i][li];
					arr[i][li]=arr[i][ri];
					arr[i][ri]=temp;
					li++ ; ri--;
				}
			}
			printTwoDArray(arr);
	return arr;
	}
	public static void main(String[] args) {
int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
printTwoDArray(arr);
	int arr2[][]=rotation(arr);

	}
	
}
