package hackerrank;

import java.util.Arrays;

public class MatchSocks {
	
	static int sockMerchant(int n, int[] ar) {
		Arrays.sort(ar);
		int pair = 0;
		int count;
		for(int i = 0 ;i < n ; i++) {
			System.out.println(ar[i]);
		}
		
		for(int i = 0 ;i < n ; ) {
			//check i, i + 1. if pair is found, then increment i to i+2
			//if not found increment i to i+1
			if(n==1) {
				pair = 0;
				break;
			}
			System.out.println("i  "+ i);
			if(ar[i] == ar[i+1]) {
				System.out.println("ar[i] == ar[i+1] "+ ar[i]+ ar[i+1]);
				i = i+2;
				pair += 1;
			}else{
				i = i + 1;
				
				
			}
			if(i >=n-1) {
				break;
			}
			
		}
		System.out.println("pair "+pair);
		return 0;

    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = 1;
	       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];
	        String[] arItems = {"100"};
	        //String[] arItems = {"1","1", "3","1", "2", "1", "3", "3", "3", "3"};
	        //String[] arItems = {"1","2","1","2","1","2","3"};
	        //String[] arItems = {"10","10","10","10","20","20","20","30","50"};
	        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = sockMerchant(n, ar);

	       // bufferedWriter.write(String.valueOf(result));
	        //bufferedWriter.newLine();

	       // bufferedWriter.close();

	       //scanner.close();
	}

}
