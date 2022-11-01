package com.meeran.gs.learning;

public class LinkedListToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result - "+ "1 -> 2 -> 3 -> null " + stringify(new Node(1, new Node(2, new Node(3)))));
        System.out.println("Result - "+ "0 -> 1 -> 4 -> 9 -> 16 -> null " + stringify(new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))));
        System.out.println("Result - "+ "null " + stringify(null));
	}
	
	 public static String stringify(Node list) {
	      // Your code here.
	      return list == null ? null : list.getData() + " -> " +   stringify(list.getNext());
	  }

}

class Node {
    private int data;
    private Node next;
    
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
