package com.meeran.datastructure;

public class StackByLinkedList {

	private Node top;
	private int height;

	public StackByLinkedList(int value){
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	}

	public void printStack() {
		Node temp = top;
		while(temp != null) {
			System.out.println("Items in the Stack - " + temp.value);
			temp = temp.next;
		}
	}

	public void push(int value) {
		Node newNode = new Node(value);
		if(height == 0) top = newNode;
		else {
			newNode.next = top;
			top = newNode;
		}
		height++;
	}

	public Node pop() {
		Node temp = top;
		if(height == 0) return null;
		else if(height == 1) top = null;
		else {
			top = top.next;
			temp.next = null;
		}
		height--;
		return temp;
	}

	public int getHeight() {
		return height;
	}

	public Node getTop() {
		return top;
	}
}
