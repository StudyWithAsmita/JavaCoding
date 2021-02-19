package hackerrank;

import java.text.DecimalFormat;

public class RatioProportion {

	
	
	static void plusMinus(int[] arr) {
			int size = arr.length;
			double numOfNeg = 0.000000d;
			double numOfPos = 0.000000d;
			double numOfZero = 0.000000d;
			for(int i = 0; i < size; i++) {
				if(arr[i] < 0) {
					numOfNeg += 1;
				}else if(arr[i] > 0) {
					numOfPos += 1;
				}else {
					numOfZero += 1;
				}
			}
			
			DecimalFormat df = new DecimalFormat("##.######");
			
			System.out.println(df.format(numOfNeg/size));
			System.out.println(df.format(numOfPos/size));
			System.out.println(df.format(numOfZero/size));

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = {"-4","3","-9","0","4","1"};
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        //scanner.close();

	}

}
