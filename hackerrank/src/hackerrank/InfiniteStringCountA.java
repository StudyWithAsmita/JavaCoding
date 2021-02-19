package hackerrank;

public class InfiniteStringCountA {

	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

    	//repeatt it n/s + 1 times to get total string unless its 0
    	long totalRepeatexact = 0;
    	long totalRepeatRemainder = 0;
    	long indexToRepeat = 0;
    	if(n%s.length() == 0 && n>s.length()) {
    		 totalRepeatexact = n/s.length();
    	}else if(n%s.length() != 0 && n>s.length()){
    		totalRepeatRemainder = n/s.length();
    		indexToRepeat = n%s.length();
    	}
    	System.out.println(totalRepeatexact);
    	System.out.println(totalRepeatRemainder);
    	long countOfA = 0;
    	for(int i=0; i < s.length();i++)
    	{
    		if(s.charAt(i) == 'a' || s.charAt(i) == 'A') {
    			countOfA += 1;
    		}
    	}
    	System.out.println("countOfA == " + countOfA);
    	long countOfRemA = 0;
    	if(n<=s.length()) {
    	 indexToRepeat = n;
    	}
    	for(int i = 0;i< indexToRepeat; i++) {
    		if(s.charAt(i)=='a' || s.charAt(i) == 'A') {
    			countOfRemA += 1;
    		}
    	}
    	
    	//now count of a needs to be multiplied by totalrepeat exact + )(totalRepeatRemainder)*countOfA +
    	//remainder amount of A
    	
    	long countToReturn = (countOfA * totalRepeatexact) + (countOfA * totalRepeatRemainder) + countOfRemA;
    	System.out.println("countToReturn == "+countToReturn);
    	return countToReturn;
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "ababa";
       // abaaba abaaba 
        
       // "abaaaaaaaaaaaa""abaaaaaaaaaaaa""abaaaaaaaaaaaa"

        long n = 3;
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        //bufferedWriter.close();

       // scanner.close();
    }
	
}
