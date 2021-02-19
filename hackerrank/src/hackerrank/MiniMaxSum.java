package hackerrank;

import java.util.Arrays;

public class MiniMaxSum {
	 // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    		Arrays.sort(arr);
    		
    		int size = arr.length;
    		long sumOfMin = 0l;
    		long SumOfMax = 0l;
    		
    		for(int i = 0,  j = (size-1); i< size -1 ;i++,j--) {
    			
    			sumOfMin += arr[i];
    			SumOfMax += arr[j];
    			
    		}
    		
    		System.out.println(sumOfMin+" "+SumOfMax);
    		
    		
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10];

        String[] arrItems = {"3","5","4","2","9"};
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

       // scanner.close();
    }
}
