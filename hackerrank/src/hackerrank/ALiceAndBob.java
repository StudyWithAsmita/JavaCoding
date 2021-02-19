package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ALiceAndBob {

	 static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		 
		int resulta = 0;
		 int resultb = 0;
		 List<Integer> titalResult = new ArrayList<Integer>(2);
		    for(int i = 0 ; i<3; i++) {
		    	
		    		if(a.get(i)> b.get(i)) {
		    			resulta+=1;
		    			//resultb+=0;
		    		}else if(a.get(i)<b.get(i)) {
		    			
		    			//resulta+=0;
		    			resultb+=1;
		    		}else {
		    			//resulta+=0;
		    			//resultb+=0;
		    		}
		    	
		    }
		  
		    titalResult.add(0,resulta);
		    titalResult.add(1,resultb);
		    return titalResult;
		 	
	    }

	    public static void main(String[] args) {
	       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] aItems = {"5","6","7"};

	        List<Integer> a = new ArrayList<Integer>();

	        for (int i = 0; i < 3; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a.add(aItem);
	        }

	        String[] bItems = {"3","6","10"};

	        List<Integer> b = new ArrayList<>();

	        for (int i = 0; i < 3; i++) {
	            int bItem = Integer.parseInt(bItems[i]);
	            b.add(bItem);
	        }

	        List<Integer> result = compareTriplets(a, b);

	        for (int i = 0; i < result.size(); i++) {
	           // bufferedWriter.write(String.valueOf(result.get(i)));
	        	

	            System.out.println(result.get(i));
	        }

	       // bufferedWriter.newLine();

	       // bufferedReader.close();
	       // bufferedWriter.close();
	    }

}
