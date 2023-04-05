package com.meeran.datastructure;

import java.util.Queue;
import java.util.LinkedList;

/*
        1
    /       \
   2          9
  /  \      /     \
 3    4     10      11
/ \   / \   / \     / \
5  6  7  8  12 13  14  15


*/

class BSTTraversal {
	public static void main(String args[]) {
// root
		BSTNode node = new BSTNode(1);

// Left side of the tree
		node.left = new BSTNode(2);
		node.left.left = new BSTNode(3);
		node.left.right = new BSTNode(4);

		node.left.left.left = new BSTNode(5);
		node.left.left.right = new BSTNode(6);

		node.left.right.left = new BSTNode(7);
		node.left.right.right = new BSTNode(8);

// Right side of the tree
		node.right = new BSTNode(9);
		node.right.left = new BSTNode(10);
		node.right.right = new BSTNode(11);

		node.right.left.left = new BSTNode(12);
		node.right.left.right = new BSTNode(13);

		node.right.right.left = new BSTNode(14);
		node.right.right.right = new BSTNode(15);

		PrintTreeNodeData tree = new PrintTreeNodeData();
		System.out.print("\nIn-Order Traversal is : ");
		tree.inOrder(node);

		System.out.print("\nPre-Order Traversal is : ");
		tree.preOrder(node);

		System.out.print("\nPost-Order Traversal is : ");
		tree.postOrder(node);

		System.out.print("\nLeft side of the Tree is : " + node.data + " ");
		tree.leftSide(node.left);

		System.out.print("\nRight side of the Tree is : " + node.data + " ");
		tree.rightSide(node.right);

		System.out.print("\nOutline of the Tree is : ");
		tree.leftSideOutline(node.left);
		System.out.print(node.data + " ");
		tree.rightSide(node.right);

		int depth = tree.depthOfTree(node, 1);
		System.out.print("\nDepth of the Tree is : " + depth);

		System.out.println("\nTree is : ");
		tree.printTree(node, depth);

	}
}

class BSTNode {
	int data;
	BSTNode left, right;

	public BSTNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

class PrintTreeNodeData {
//nLR
	public void preOrder(BSTNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

//LnR
	public void inOrder(BSTNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

//LRn
	public void postOrder(BSTNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

//L
	public void leftSide(BSTNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		leftSide(node.left);
	}

//R
	public void rightSide(BSTNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		rightSide(node.right);
	}

//L (reverse)
	public void leftSideOutline(BSTNode node) {
		if (node == null) {
			return;
		}
		leftSideOutline(node.left);
		System.out.print(node.data + " ");
	}

	public int depthOfTree(BSTNode node, int depth) {
		if (node == null) {
			return depth;
		}
		int left = depth;
		int right = depth;
		if (node.left != null) {
			left = depthOfTree(node.left, depth + 1);
		}
		if (node.right != null) {
			right = depthOfTree(node.right, depth + 1);
		}
		return Math.max(left, right);
	}

	public void printTree(BSTNode node, int depth) {

		if (node == null) {
			return;
		}
		Queue<BSTNode> queue = new LinkedList<BSTNode>();

		queue.add(node);

		while (true) {
			int nodeCount = queue.size();
			if (nodeCount == 0) {
				break;
			}
			for (int i = 0; i < depth - 1; i++) {
				System.out.print("     ");
			}
			while (nodeCount > 0) {
				BSTNode queueNode = queue.peek();
				System.out.print("(" + queueNode.data + ")");

				for (int j = depth; j > 0; j--) {
					if (j == 1) {
						System.out.print(" ");
					} else if (j == 2) {
						System.out.print("   ");
					} else {
						System.out.print("    ");
					}
				}

				queue.remove();

				if (queueNode.left != null) {
					queue.add(queueNode.left);
				}
				if (queueNode.right != null) {
					queue.add(queueNode.right);
				}
				nodeCount--;
			}
			depth--;
			System.out.println();
		}
	}

	public void printTr(BSTNode node, int depth) {
		if (node == null) {
			return;
		}
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		queue.add(node);

		while (true) {
			int nodeCount = queue.size();
			if (nodeCount == 0) {
				break;
			}
			for (int i = 0; i < depth - 1; i++) {
				System.out.print("    ");
			}
			while (nodeCount > 0) {
				BSTNode queueNode = queue.peek();
				System.out.print("[" + queueNode.data + "]");
				for (int j = depth; j > 0; j--) {
					if (j == 1) {
						System.out.print(" ");
					} else if (j == 2) {
						System.out.print("   ");
					} else {
						System.out.print("    ");
					}
				}
				queue.remove();

				if (queueNode.left != null) {
					queue.add(queueNode.left);
				}
				if (queueNode.right != null) {
					queue.add(queueNode.right);
				}
				if (nodeCount > 1) {
					System.out.print(", ");
				}
				nodeCount--;
			}
			depth--;
			System.out.println();
		}
	}

	public void printLastLeft(BSTNode node, int depth) {
		if (node == null) {
			return;
		}
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		queue.add(node);
		int count = 1;
		while (true) {
			int nodeCount = queue.size();
			if (nodeCount == 0) {
				break;
			}

			while (nodeCount > 0) {
				BSTNode queueNode = queue.peek();

				if (queueNode.left != null) {
					queue.add(queueNode.left);
				}
				if (count == depth - 1) {
					System.out.print(queueNode.data + " ");
				}
				if (queueNode.right != null) {
					queue.add(queueNode.right);
				}
				queue.remove();
				nodeCount--;

			}
			System.out.println();
			count++;
		}
	}

	public void printLastRight(BSTNode node, int depth) {
		if (node == null) {
			return;
		}
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		queue.add(node);
		int count = 1;
		while (true) {
			int nodeCount = queue.size();
			if (nodeCount == 0) {
				break;
			}

			while (nodeCount > 0) {
				BSTNode queueNode = queue.peek();

				if (queueNode.left != null) {
					queue.add(queueNode.left);
				}
				if (count == depth - 1) {
					System.out.print(queueNode.data + " ");
				}

				if (queueNode.right != null) {
					queue.add(queueNode.right);
				}
				queue.remove();
				nodeCount--;

			}
			System.out.println();
			count++;
		}
	}
}