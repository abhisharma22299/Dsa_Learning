package String;

public class PrintDuplicatesChar {
	public static void printDuplicates(String str) {
          str=str.toLowerCase();
		char ch[] = str.toCharArray();
       int arr[]=new int[26];
        
       for(int i=0;i<ch.length;i++) {
    	   arr[ch[i]-97]++;
       }
       for(int j=0;j<ch.length;j++)
       {
    	   if((arr[ch[j]-97])>=2) {
    		   System.out.print(ch[j]+" ");
    	   }
    	   }
       System.out.println();
		for(int cha:arr) {
			System.out.print(cha+" ");
		}
	}

	public static void main(String[] args) {
		printDuplicates("Abhsaofjijksfn");
	}
}
