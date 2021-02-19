package hackerrank;

public class TimeConversion {
	static String timeConversion(String s) {
        //use StringBuffer to replace and manipulate the string
		
	    String[] strSplit = s.split(":");
	   
	    String returnString = "";
	    //System.out.println(strSplit[0]+strSplit[1]+strSplit[2]);
	    
	    int time;
	    	if(strSplit[2].contains("PM")) {
	    		
	    		
		    	if(Integer.parseInt(strSplit[0])<12) {
		    		time = 12 + Integer.parseInt(strSplit[0]);
		    	}else {
		    		time = Integer.parseInt(strSplit[0]);
		    	}
		    	String newTime = time+":"+strSplit[1]+":"+strSplit[2];
		    	returnString = newTime.replaceAll("PM", "");
		    	System.out.println(returnString);
		    	
	    	}
	    	else if(strSplit[2].contains("AM")){
	    		
	    		if(Integer.parseInt(strSplit[0])==12) {
	    			String newTime = "00"+":"+strSplit[1]+":"+strSplit[2];
			    	returnString = newTime.replaceAll("AM", "");
			    	System.out.println(returnString);
	    		}else {
	    			returnString = s.replaceAll("AM", "");
	    			System.out.println(returnString);
	    		}
		    	
	    		
	    	}
	    	return returnString;
	    
//	    if(timeAMPM.equalsIgnoreCase("AM")) {
//	    	 //buf.replace((buf.length()-2), buf.length()-1, "");
//	    	
//	    	
//	    }else {
//	    	
//	    }
		//System.out.println(timeAMPM);
		//return s;
    }

  //  private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args)  {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // String s = scan.nextLine();
    	String s = "12:40:22AM";

        String result = timeConversion(s);

        //bw.write(result);
        //bw.newLine();

        //bw.close();
    }
}
