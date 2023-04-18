package com.meeran.datastructure;

public class BinarySearchTree {

	private Node root;
	
	private boolean insert(int value) {
		Node newNode = new Node(value);
		if(root==null) {
			root=newNode;
			return true;
		}
		Node temp = root;
		while(true) {
			if(newNode.value==temp.value) return false;
			else if(newNode.value<temp.value) {
				if(temp.left==null) {
					temp.left=newNode;
					return true;
				}
				temp=temp.left;
			}else {
				if(temp.right==null) {
					temp.right=newNode;
					return true;
				}
				temp=temp.right;
			}
		}
	}
	
	private boolean contains(int value) {
		Node temp= root;
		while(temp!=null) {
			if(value<temp.value) temp=temp.left;
			else if(value>temp.value) temp=temp.right;
			else return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree myBST = new BinarySearchTree();
		
		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.insert(18);
		myBST.insert(52);
		myBST.insert(82);
		
		System.out.println(myBST.root.left.right);
		
		System.out.println("IS Exists? False- "+myBST.contains(27));
		
		myBST.insert(27);
		
		System.out.println(myBST.root.left.right.value);
		
		System.out.println("IS Exists? True- "+myBST.contains(27));
	}

}
