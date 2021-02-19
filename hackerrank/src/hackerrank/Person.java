package hackerrank;

import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
          if(initialAge < 0){
              System.out.println("Age is not valid, setting age to 0.");
              age = 0;
          }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
          StringBuffer strToPrint = new StringBuffer("You are old.");
          if(this.age < 13){
              strToPrint.replace(0, strToPrint.length()-1, "You are young.");
          }else if(this.age >=13 && this.age < 18){
        	  strToPrint.replace(0, strToPrint.length()-1,"You are a teenager.");
          }
        System.out.println(strToPrint);
	}

	public void yearPasses() {
  		// Increment this person's age.
          this.age += 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}