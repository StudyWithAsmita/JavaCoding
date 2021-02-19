package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountingValleys {
	
	 public static int countingValleys(int steps, String path) {
		    // Write your code here
		 int variableToIncrease = 0;
		 List<Integer> variableStore = new ArrayList<Integer>(steps);
		// variableStore.add(variableToIncrease);
		 
		 for(int i =0 ; i < steps; i++) {
			 char temp = path.charAt(i);
			 //System.out.println("temp == "+temp);
			 if(temp == 'U') {
				 
				 variableToIncrease +=1;
				// System.out.println(variableToIncrease);
			 }else if(temp == 'D') {
				
				 variableToIncrease -=1;
				// System.out.println(variableToIncrease);
			 }
			 variableStore.add(variableToIncrease);
		 }
		 //we need to see if number beteen two zero is positive or negative.
		 //if negative then count that as one valley
		boolean valley = false;
		List valleyArray = new ArrayList();
		// System.out.println(indexOfzero);
		
		 for(int i = 0;i < variableStore.size() ;  i++) {
			 
			 //need to count zeroes to count valles - 1
			 //System.out.println(variableStore.get(i));
			 if(variableStore.get(i) != 0) {
				 if(variableStore.get(i) < 0) {
					 valley = true;
				 }
				 
			 }
			 else {
				 valleyArray.add(valley);
				 valley = false;
			 }
			
			 
		 }
		 int countOfValley = 0;
		 for(int i= 0 ;i < valleyArray.size(); i++) {
			if((boolean)valleyArray.get(i) == true) {
				countOfValley += 1;
			}
		 }
		 System.out.println(countOfValley);
		 return countOfValley;

		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  int steps = Integer.parseInt(bufferedReader.readLine().trim());
		 int steps = 14;
		 String path = "UDDDUUUUDDDDUU";
//        String path = bufferedReader.readLine();
//
         int result = CountingValleys.countingValleys(steps, path);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

	}

}
