package Number;

import java.util.Iterator;

public class Root {
	public static int root(int n)
	{
		int root1=-1;
		int previousRoot;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				root1=i;
			}
		}
		return root1;
	}
public static void main(String[] args) {
	System.out.println(root(12));
}
}
