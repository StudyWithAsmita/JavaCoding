package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int n = 4;
        int[] arr = new int[n];

        String[] arrItems = {"1","4","3","2"};
        //String[] arrItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        for (int i = (arr.length - 1) ; i >=0 ; i--) {
        	System.out.print(arr[i]+" ");
        	
        }
       

	}

}
