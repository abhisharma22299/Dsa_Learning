package Array;

import java.util.Iterator;

public class MissingElemment {
	public static void main(String[] args) {

		int arr[]= {1,4,3,5,6};	
		int lenght=arr.length;
		int sumArray=0;
		for(int a:arr) {
			sumArray+=a;
		}

		int sumOfNTerms=((lenght+1)*(lenght+2))/2;
		int missingElement=sumOfNTerms-sumArray;
		
		System.out.println("Missing Element : " + missingElement);
		
	
	}
}
