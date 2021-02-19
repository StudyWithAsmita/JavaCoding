package hackerrank;
import java.io.*;
import java.util.*;

public class StackQueuePalindrome {
    // Write your code here.
	Stack stack;
	ArrayDeque queue;
	StackQueuePalindrome(){
		stack = new Stack();
		queue = new ArrayDeque();
	}
	
	void pushCharacter(char c){
		stack.push(c);
	}
	void enqueueCharacter(char c) {
		//System.out.println(c);
		queue.add(c);
		
	}
	char popCharacter() {
		char toRet = (char) stack.pop();
		System.out.println("stack pop "+toRet);
		return toRet;
	}
	char dequeueCharacter() {
		char toRet = (char) queue.remove();
		System.out.println("queue poll "+toRet);
		return (toRet) ;
	}
	
	public void print_queue(){      
        PriorityQueue copy = new PriorityQueue();
        copy.addAll(queue) ;        
        Iterator through = queue.iterator() ;
        while(through.hasNext() ) {
                System.out.print(through.next() + " ") ;
        }
        System.out.println();
	}
                
       // actual_queue.addAll(copy) ;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // String input = scan.nextLine();
        String input = "able was i ere i saw elba";
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StackQueuePalindrome p = new StackQueuePalindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        p.print_queue();

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
