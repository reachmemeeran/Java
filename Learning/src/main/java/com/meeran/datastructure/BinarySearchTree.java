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
	
	private boolean rContains(int value) {
		return rContains(root,value);
	}
	
	private boolean rContains(Node currentNode, int value) {
		if(currentNode == null) return false;
		if(currentNode.value==value) return true;
		if(value < currentNode.value) return rContains(currentNode.left, value);
		else return rContains(currentNode.right, value);
	}
	
	private void rInsert(int value) {
		if(root ==null) root = new Node(value);
		rInsert(root, value);
	}
	
	private Node rInsert(Node currentNode, int value) {
		if(currentNode==null ) return new Node(value);
		if(value < currentNode.value) currentNode.left = rInsert(currentNode.left, value);
		else currentNode.right = rInsert(currentNode.right, value);
		return currentNode;
	}
	
	private void deleteNode(int value) {
		if(root !=null) deleteNode(root, value);
	}
	
	private Node deleteNode(Node currentNode, int value) {
		if(currentNode==null ) return null;
		if(value < currentNode.value) currentNode.left = deleteNode(currentNode.left, value);
		else if(value > currentNode.value) currentNode.right = deleteNode(currentNode.right, value);
		else {
			if(currentNode.left==null && currentNode.right==null) return null;
			else if(currentNode.left==null ) currentNode = currentNode.right;
			else if(currentNode.right==null) currentNode = currentNode.left;
			else {
				int subTreeMin = minimumValue(currentNode.right);
				currentNode.value = subTreeMin;
				currentNode.right = deleteNode(currentNode.right, subTreeMin);
			}
		}
		return currentNode;
	}
 
	private int minimumValue(Node currentNode) {
		while(currentNode.left !=null) currentNode = currentNode.left;
		return currentNode.value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree myBST = new BinarySearchTree();
		
		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.rInsert(18);
		myBST.rInsert(52);
		myBST.insert(82);
		
		System.out.println(myBST.root.left.right);
		
		System.out.println("IS Exists? False- "+myBST.contains(27));
		
		System.out.println("IS Exists? recurrsive False- "+myBST.rContains(27));
		
		myBST.insert(27);
		
		System.out.println(myBST.root.left.right.value);
		
		System.out.println("IS Exists? True- "+myBST.contains(27));
		
		System.out.println("IS Exists? recurrsive True- "+myBST.rContains(27));
		
		
		System.out.println("Min Value- "+myBST.minimumValue(myBST.root));
		
		System.out.println("Min Value right- "+myBST.minimumValue(myBST.root.right));
		
		BinarySearchTree myBST1 = new BinarySearchTree();
		
		myBST1.insert(2);
		myBST1.insert(1);
		myBST1.insert(3);
		
		System.out.println("Root: "+myBST1.root.value);
		System.out.println("Root left: "+myBST1.root.left.value);
		System.out.println("Root right: "+myBST1.root.right.value);
		
		myBST1.deleteNode(2);
		
		System.out.println("Root: "+myBST1.root.value);
		System.out.println("Root left: "+myBST1.root.left.value);
		System.out.println("Root right: "+myBST1.root.right);
	}

}
