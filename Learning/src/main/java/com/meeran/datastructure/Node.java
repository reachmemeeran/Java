package com.meeran.datastructure;

public class Node {
	int value;
	Node next, prev;
	Node left,right;
	
	public Node() {
	}

	public Node(int value) {
		this.value = value;
	}

	public Node(Node left, Node right, int val) {
		this.value = val;
		this.left = left;
		this.right = right;
	}
	
	
}
