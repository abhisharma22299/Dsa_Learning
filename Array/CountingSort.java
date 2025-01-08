package Array;
public class CountingSort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }

        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
        	outputArray[countArray[inputArray[i]]-1] =	inputArray[i];
        	countArray[inputArray[i]]--;
        }

        return outputArray;
    }
    
    
   public static int[] test(int inputArr[]) {
	   
	   int max=inputArr[0];
	   // find max element from the array
	   for(int z: inputArr)
	   {
		   max=Math.max(max, z);
	   }   
	  
	   int countArr[]=new int[max+1];
	   // calculating count array
	   for(int z:inputArr) {
		   countArr[z]++;
	   }
	   for(int q:countArr)
		   System.out.print(q+	" "); 
	   
	   System.out.println();
	   // find the prefix sum for the count array
	   int temp=countArr[0];
	   for(int i=1;i<countArr.length;i++) {
		  temp+=countArr[i];
		  countArr[i]=temp;
	   }
	   for(int q:countArr)
		   System.out.print(q+" "); 
	   System.out.println();
	   int outputArr[]=new int[inputArr.length];
	   //  calculating the output array 
	   
	   for(int j=inputArr.length-1;j>=0;j--) {
		   
		   outputArr[countArr[inputArr[j]]-1]=inputArr[j];
		   countArr[inputArr[j]]--;
	   }
	 
	   return null;
	   
   }
    
    
    

    public static void main(String[] args) {
        int[] inputArray = {2,5,3,0,2,3,0,3};
        int[] outputArray = test(inputArray);

       
    }

}