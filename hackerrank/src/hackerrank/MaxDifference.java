package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	Difference(int[] a){
  		this.elements = a;
  	}
  	public void computeDifference() {
  		Arrays.sort(elements);
  		maximumDifference = Math.abs(Math.abs(elements[elements.length-1])-Math.abs(elements[0]));
  	}

	// Add your code here

} // End of Difference class

public class MaxDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = 3;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 5;
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
