package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoundingGrades {
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
		for (int i = 0 ; i < grades.size(); i++) {
			if(grades.get(i) >= 38) {
				int add5 = grades.get(i) + 5;
				int remainder = add5%5;
				int nextMult5 = add5 - remainder;
				if((nextMult5 - grades.get(i)) < 3) {
					grades.set(i, nextMult5);
				}
			}
		}
		return grades;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
		int gradesCount = 4;
		Random rand = new Random(); 

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
        	int rand_int1 = rand.nextInt(100); 
            //int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
        
            grades.add(rand_int1);
            System.out.println(grades.get(i));
        }

        List<Integer> result = RoundingGrades.gradingStudents(grades);
        System.out.println("Result");
        for (int i = 0; i < result.size(); i++) {
        	
        	System.out.println(result.get(i));
        }

//       // for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(String.valueOf(result.get(i)));
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

	}

}
