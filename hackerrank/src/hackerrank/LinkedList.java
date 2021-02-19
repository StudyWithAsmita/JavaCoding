package hackerrank;

import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {

    public static  Node insert(Node head,int data) {
        //Complete this method
    	Node start = head;
    	Node prev = start;
        while(start!=null) {
        	System.out.println(start.data);
        	prev = start;
            start = start.next;
        }
        if(head == null) {
        	System.out.println("inside null");
         Node toInsert = new Node(data);
         head = toInsert;
         head.next = null;
        
         return head;
        }
        else if(start == null && head != null) {
        	System.out.println("inside null");
            Node toInsert = new Node(data);
            start = toInsert;
            start.next = null;
            if(prev != null) {
           	 prev.next = start;
            }
            return head;
        }else {
        	return head;
        }
        
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
       // int N = sc.nextInt();
        int N = 4;
        String[] intArr = {"2","3","4","1"};

        for(int i = 0; i < 4; i ++) {
            int ele = Integer.parseInt(intArr[i]);
            head = insert(head,ele);
        }
       display(head);
        sc.close();
    }
}
