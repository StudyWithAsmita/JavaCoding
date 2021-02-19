package hackerrank;

import java.util.*;

class Person1 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person1(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person1{
	Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		this.testScores = scores;
		
		
		// TODO Auto-generated constructor stub
	}

	private int[] testScores;
	int sum = 0;
	int average = 1;
	char charToReturn = 'O';
	char calculate() {
		for(int score : testScores) {
			sum = sum + score;
		}
		average = sum/testScores.length;
		if(average < 40) {
			return 'T';
		}
		if(average <55) {
			return 'D';
		}
		if(average < 70)
		{
			return 'P';
			
		}
		if(average < 80) {
			return 'A';
			
		}
		if(average < 90) {
			return 'E';
			
		}
		else{
			return 'O';
		}
		//return charToReturn;
		
	}

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

class PersonStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String firstName = scan.next();
		//String lastName = scan.next();
		String firstName = "Heraldo";
		String lastName = "Memelli";
		//int id = scan.nextInt();
		int id = 8135627;
		int numScores = 2;
		int[] testScores = new int[numScores];
		testScores[0] = 49;
		testScores[1] = 30;
//		for(int i = 0; i < numScores; i++){
//			testScores[i] = scan.nextInt();
//		}
//		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
