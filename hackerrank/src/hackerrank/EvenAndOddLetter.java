package hackerrank;

public class EvenAndOddLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int n = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int n = 2;
        //int[] arr = new int[n];

		String[] arrItems = {"Hacker" , "Rank"};
        //String[] arrItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		//String[] arrItems = new String[n];
	       // String[] arrItems = scanner.nextLine().split(" ");
		/*
		 * for (int i = 0; i < n; i++) { String temp = scanner.nextLine();
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); arrItems[i] = temp; }
		 */
		
		String odd = "";
		String even = "";
        for(String item : arrItems){
        	odd = "";
        	even = "";
            for(int i=0 ; i< item.length(); i = i+2){
            	odd = odd + item.charAt(i);
                
            }
            for(int i = 1; i < item.length(); i = i+2) {
            	even = even + item.charAt(i);
            }
            System.out.println(odd+" "+even);
        }

	}

}
