package TileProblemWithRecursion;
public class PlaceTiles {
public static int placeTiles(int n,int m) {
	if(n==m) {
		return 2;
	}
	if(n<m) {
		return 1;
	}
	//vertical
	int verticalPlace=placeTiles(n-m, m);
	//horizontal 
	int horizontalPlace=placeTiles(n-1, m);	
	return horizontalPlace+verticalPlace;
}
public static void main(String[] args) {
System.out.println(placeTiles(4, 2));
}
}