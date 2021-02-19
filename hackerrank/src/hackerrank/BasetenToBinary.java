package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasetenToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int n = 439;
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
       // scanner.close();
        
        //find consecutive ones from the binary string of 1's and 0s
        List consecArr = new ArrayList();
        int count = 0;
        for(int i = 0; i< bin.length(); i++) {
        	System.out.println("bin.charAt(i) == "+bin.charAt(i));
        	if(bin.charAt(i)=='1') {
        		//System.out.println("inside 1");
        		count = count + 1;
        	}else { 
        		//System.out.println("inside 0");
        		consecArr.add(count);
        		count = 0;
        	}
        	if(i ==( bin.length() - 1)) {
        		consecArr.add(count);
        	}
        	
        }
        
        Collections.sort(consecArr , Collections.reverseOrder());
        
        for(int i = 0;i < consecArr.size() ; i++) {
        	System.out.println(consecArr.get(i));
        }
        System.out.println(consecArr.get(0));

	}

}
