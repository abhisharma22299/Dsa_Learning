package Recursion;

public class PrintRoadMap {
	
	public static void printPath(int curr,int des,String s) {
		if(curr==des) {
			// positive case
			System.out.println(s);
			return;
		}
		if(curr>des) {
			// negative case
			return;
		}
		
		printPath(curr+1, des, s+"1");
		printPath(curr+2, des, s+"2");
		printPath(curr+3, des, s+"3");
		printPath(curr+4, des, s+"4");
		printPath(curr+5, des, s+"5");
		printPath(curr+6, des, s+"6");
	}
	public static void main(String[] args) {
		printPath(0, 6, "");
	}

}
