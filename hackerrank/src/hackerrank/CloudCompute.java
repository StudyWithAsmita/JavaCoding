package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class CloudCompute {

    // Complete the maximumPeople function below.
    static long maximumPeople(long[] p, long[] x, long[] y, long[] r) {
        // Return the maximum number of people that will be in a sunny town after removing exactly one cloud.
    	int numofclouds = y.length;
    	//long[] population = new long[p.length];
    	//find the location of the cloud and store the points in an array
    	// called cloudcoverpoints with the range given for that cloud
    	Map cloudcoverpoints = new HashMap<Integer, List>(numofclouds);
    	for(int i = 0 ; i< numofclouds; i++) {
    		List range = new ArrayList();
    		range.add(0,y[i]-r[i]);
    		range.add(1,y[i]);
    		range.add(2,y[i]+r[i]);
    		cloudcoverpoints.put(i, range);
    		
    	}
    	
    	//cloudcoverpoints.forEach((key, value) -> System.out.println(key + ":" + value));
    	
    	long[] population = new long[numofclouds];
    	long[] locationsAdd = new long[numofclouds];
    	 Iterator<Map.Entry<Integer, List>> itr = cloudcoverpoints.entrySet().iterator(); 
         // find all the cities and take the population which is covered with a cloud
    	 int count = 0;
         while(itr.hasNext()) 
         { 
              Entry<Integer, List> entry = itr.next(); 
              System.out.println("Key = " + entry.getKey() +  
                                  ", Value = " + entry.getValue()); 
              List values = entry.getValue();
              int valueLength = values.size();
              for(int j=0; j< x.length; j++) {
            	  for (int i=0; i < valueLength; i++) {
            		  if((long)values.get(i)== x[j]) {
            			  population[count] = p[j];
            			  locationsAdd[count] = j;
            			  count++;
            			  System.out.println(p[j]);
            			  break;
            		  }else {
            			  // not matched with cloud ones frst range
            		  }
            	  }
            	  
              }
              
              
         } 
         //now find max of the population array/ list
         
        Arrays.sort(population);
       
       //print the locations
        for(int i = 0; i< locationsAdd.length; i++) {
        	System.out.println("loc ["+i+"]"+locationsAdd[i]);
        }
        
        //the max population from this is last index of populations
       System.out.println("max pops" + population[population.length-1]);
        //when one cloud is removed wich has the max popultion is 
        long cloudmax = population[population.length-1];
        
        // add this number with all the cities population that do not have any cloud cover
        System.out.println("lengh of p == "+p.length);
        for(int i=0 ; i < locationsAdd.length ; i++) {
        	System.out.println(" p removed = "+p[(int) locationsAdd[i]]);
        	p[(int) locationsAdd[i]] = 0;
        	
        }
        long sum = 0;
        System.out.println("lengh of p 2  == "+p.length);
        for (int i = 0; i<p.length; i++) {
        	System.out.println("p == "+p[i]);
        	sum = sum + p[i];
        }
        sum = sum + cloudmax;
        System.out.println("summ === "+sum);
    	return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       
    	int n = 2;
      //  int n = scanner.nextInt();
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] p = new long[4];

      //  String[] pItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] pItems = {"10","100"};

        for (int i = 0; i < n; i++) {
            long pItem = Long.parseLong(pItems[i]);
            p[i] = pItem;
        }

        long[] x = new long[n];

      //  String[] xItems = scanner.nextLine().split(" ");
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] xItems = {"5","100"};

        for (int i = 0; i < n; i++) {
            long xItem = Long.parseLong(xItems[i]);
            x[i] = xItem;
        }
        int m = 1;
       // int m = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] y = new long[m];

       // String[] yItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] yItems = {"4"};

        for (int i = 0; i < m; i++) {
            long yItem = Long.parseLong(yItems[i]);
            y[i] = yItem;
        }

        long[] r = new long[m];

       // String[] rItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] rItems = {"1"};

        for (int i = 0; i < m; i++) {
            long rItem = Long.parseLong(rItems[i]);
            r[i] = rItem;
        }
        System.out.println(n);
        System.out.println(p.toString());
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(r.toString());
        long result = maximumPeople(p, x, y, r);

       // bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

       // bufferedWriter.close();

        //scanner.close();
    }
}

