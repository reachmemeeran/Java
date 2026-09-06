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
	// Kept as a structural definition class without main
}

class PrintTreeNodeData {
	//nLR
	public void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	//LnR
	public void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}

	//LRn
	public void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
	}

	//L
	public void leftSide(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		leftSide(node.left);
	}

	//R
	public void rightSide(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		rightSide(node.right);
	}

	//L (reverse)
	public void leftSideOutline(Node node) {
		if (node == null) {
			return;
		}
		leftSideOutline(node.left);
		System.out.print(node.value + " ");
	}

	public int depthOfTree(Node node, int depth) {
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

	public void printTree(Node node, int depth) {

		if (node == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();

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
				Node queueNode = queue.peek();
				System.out.print("(" + queueNode.value + ")");

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

	public void printTr(Node node, int depth) {
		if (node == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
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
				Node queueNode = queue.peek();
				System.out.print("[" + queueNode.value + "]");
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

	public void printLastLeft(Node node, int depth) {
		if (node == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		int count = 1;
		while (true) {
			int nodeCount = queue.size();
			if (nodeCount == 0) {
				break;
			}

			while (nodeCount > 0) {
				Node queueNode = queue.peek();

				if (queueNode.left != null) {
					queue.add(queueNode.left);
				}
				if (count == depth - 1) {
					System.out.print(queueNode.value + " ");
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

	public void printLastRight(Node node, int depth) {
		if (node == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		int count = 1;
		while (true) {
			int nodeCount = queue.size();
			if (nodeCount == 0) {
				break;
			}

			while (nodeCount > 0) {
				Node queueNode = queue.peek();

				if (queueNode.left != null) {
					queue.add(queueNode.left);
				}
				if (count == depth - 1) {
					System.out.print(queueNode.value + " ");
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
