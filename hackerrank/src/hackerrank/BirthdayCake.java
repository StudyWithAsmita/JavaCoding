package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCake {
	
	 public static int birthdayCakeCandles(List<Integer> candles) {
		    // Write your code here
		 
		 Collections.sort(candles,Collections.reverseOrder());
		 
		 Integer maxList = Collections.max(candles);
		 
		 int countOfCandle = 0;
		 for(Integer item:candles ) {
			 if(item >= maxList) {
			 if(maxList.equals(item)) {
				 countOfCandle += 1;
			 }
			 }else {
				 break;
			 }
		 }
		 return countOfCandle;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int candlesCount = 4;
       // int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

		String[] candlesTemp = {"3","2","1","3"};
        //String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<Integer>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = BirthdayCake.birthdayCakeCandles(candles);
        System.out.println(result);


	}

}
