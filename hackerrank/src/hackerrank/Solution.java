package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the findMedian function below.
    static float findMedian(float[] arr) {
    	//int length = arr[0];
    	Arrays.sort(arr);
        for(float temp : arr){
            
            System.out.println(temp);
        }
        if(arr.length % 2 > 0) {
        	  return arr[arr.length /2];
         }
           else {
        	  float average = (arr[arr.length/2] + arr[arr.length/2 +1])/2;
        	   return average;
           }
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  int n = scanner.nextInt();
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      //  int[] arr = new int[n];

       // String[] arrItems = scanner.nextLine().split(" ");
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      /*  for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }*/
    	
    	float[] arr = new float[7];
    	arr[0] = 0;
    	arr[1] = 1;
    	arr[2] = 2;
    	arr[3] = 4;
    	arr[4] = 6;
    	arr[5] = 5;
    	arr[6] = 3;
    	//arr[7] = 2;
    	
      //  float result = findMedian(arr);
      //  System.out.println(result);
        
        int[] arr1 = new int[7];
        arr1[0] = 12;
        arr1[1] = 15;
        arr1[2] = 1;
        arr1[3] = 5;
        arr1[4] = 6;
        arr1[5] = 14;
        arr1[6] = 11;
       // arr1[4] = 20;
       // arr1[4] = 15;
       // arr1[4] = 4;
       // arr1[4] = 2;
        int resultIns = insertionSort(arr1);
        System.out.println(resultIns);
       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        //bufferedWriter.close();

       // scanner.close();
    }
    
    
    static int insertionSort(int[] arr) {
    	int j; 
    	int n = arr.length;
    	int count = 0;
        for (int i = 1; i < n; i++) 
        {  
            int key = arr[i];  
            j = i - 1;  
      
            /* Move elements of arr[0..i-1], that are  
            greater than key, to one position ahead  
            of their current position */
            while (j >= 0 && arr[j] > key) 
            {  
                arr[j + 1] = arr[j];  
                j = j - 1; 
                count += 1;
            }  
            arr[j + 1] = key;  
        }  
        return count;
}
    
}
