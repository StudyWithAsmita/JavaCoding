package hackerrank;

public class JumpingOnCLouds {
	
	static int jumpingOnClouds(int[] c) {
		//remove if the last element is 1;
		
		int jump = 0;
		for(int i = 0 ;i < c.length; ) {
			if(i<c.length - 2) {
				if( c[i+2] == 0) {
					jump = jump+1;
					i = i+2;
				}else if( c[i+2] == 1) {
					jump = jump + 1;
					i = i+1;
					
				}
			}else if(i<c.length - 1) {
					if( c[i+1] == 0) {
						jump = jump+1;
						i = i+1;
					}else if( c[i+1] == 1) {
						jump = jump + 1;
						i = i+1;
						
					}
			}else {
				i = i + 1;
			}
			
//			}else {
//				if( c[i+1] == 0) {
//					jump = jump+1;
//					i = i+1;
//				}else if( c[i+1] == 1) {
//					jump = jump + 1;
//					i = i+1;
//					
//				}
//			}
		}
		System.out.println(jump);
return jump;

    }

	// private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n  = 11;
        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];
        String[] cItems = {"0","0","1","0","0","1","0","0","0","0","1"};

       // String[] cItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
	}

}
