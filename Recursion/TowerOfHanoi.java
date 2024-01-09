package Recursion;

public class TowerOfHanoi {
	
	public static void towerOfHanio(int n, String src,String helper,String dest ) {
		if(n==1) {
			System.out.println("Transfer Disk "+ n +" From "+src+" to "+dest);
				return; 
		}
		towerOfHanio(n-1, src, dest, helper);
		System.out.println("Transfer Disk "+n +" From "+src+" to "+dest);
		
		towerOfHanio(n-1, helper, src, dest);
		
	}
	// main class
				public static void main(String args[]) {
					/*Program to solve the Tower Of Hanoi Problem
					 *Tower Of Hanoi Problem Rules
					 
					 * Only one disk transferred in 1 steps 
					 * Smaller disks are always kept on the top of the larger disk 
					 * time Complexity O(2^n)
					 
					  */
					
					towerOfHanio(3, "S","H", "D");
				}
}
