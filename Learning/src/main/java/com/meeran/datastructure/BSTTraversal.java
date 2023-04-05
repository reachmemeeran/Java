package com.meeran.datastructure;

import java.util.Queue;
import java.util.LinkedList;

class Node{
	int data;
	Node left, right;
	
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

class TreeTraverse{
	void preOrder(Node node){
		if(node==null)return;
		
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	void inOrder(Node node){
		if(node==null)return;
		
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	
	void postOrder(Node node){
		if(node==null)return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
	
}

class TreeDepth{
	
	int treeDepth(Node node, int depth) {
		if(node==null)return depth;
		int left=depth;
		int right=depth;
		if(node.left!=null) left=treeDepth(node.left, depth+1);
		if(node.right!=null) left=treeDepth(node.right, depth+1);
		return Math.max(left, right);
	}
}

class PrintTree{
	void printTree(Node node) {
		if(node==null)return;
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(node);
		while(true) {
			int queueSize = queue.size();
			if(queueSize==0)return;
			while(queueSize-->0) {
				Node queueNode = queue.peek();
				System.out.print("("+queueNode.data+")");
			}
		}
	}
}
	/*

	                1

	        2              9

	      3    4      10      11

	    5  6  7  8  12  13  14  15


	*/
public class BSTTraversal {
	public static void main(String args[]){
	    // Root Node of the tree
	    Node node = new Node(1);
	    //Left Side of the tree
	    node.left = new Node(2);
	    node.left.left = new Node(3);
	    node.left.right = new Node(4);
	    node.left.left.left = new Node(5);
	    node.left.left.right = new Node(6);
	    node.left.right.left = new Node(7);
	    node.left.right.right = new Node(8);

	    //Right Side of the tree
	    node.right = new Node(9);
	    node.right.left = new Node(10);
	    node.right.right = new Node(11);
	    node.right.left.left = new Node(12);
	    node.right.left.right = new Node(13);
	    node.right.right.left = new Node(14);
	    node.right.right.right = new Node(15);

	    //Traverse the Tree
	    TreeTraverse tree = new TreeTraverse();
	    System.out.print("The Pre-order traversal of the tree is: ");
	    tree.preOrder(node);
	    System.out.print("\nThe In-order traversal of the tree is: ");
	    tree.inOrder(node);
	    System.out.print("\nThe Post-order traversal of the tree is: ");
	    tree.postOrder(node);
	    
	    // Find the depth of the tree
	    TreeDepth treeDepth = new TreeDepth();
	    int depth = treeDepth.treeDepth(node,0);
	    System.out.print("\nThe Depth of the tree is: "+depth);
	    
	    //Print the tree
	    PrintTree printTree = new PrintTree();
	    System.out.println("\nThe tree is: ");
	    printTree.printTree(node);
	  }
}
