package com.meeran.datastructure;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToTree {
	public static TreeNode flatten(ListNode head) {
		if(head == null) return null;
		List<Integer> values = new LinkedList<Integer>();
		getListValues(head, values);
		Collections.sort(values);
		return createTree(values, 0);
	}

	private static void getListValues(ListNode head, List<Integer> values ) {
		if(head != null) {
			getTreeValues(head.data, values);
			getListValues(head.next, values);
		}
	}

	private static void getTreeValues(TreeNode data, List<Integer> values) {
		if(data != null) {
			if(!values.contains(data.value)) values.add(data.value);
			getTreeValues(data.left, values);
			getTreeValues(data.right, values);
		}
	}

	private static TreeNode createTree(List<Integer> values, int index) {
		if (index >= values.size()) return null;

		Integer value = values.get(index);
		if (value == null) return null;
		System.out.println("value-->" + value);

		TreeNode tree = new TreeNode(value);

		tree.left = createTree(values, index * 2 + 1);

		tree.right = createTree(values, index * 2 + 2);
		if(tree.left != null) System.out.println("left->" + tree.left.value);
		if(tree.right != null) System.out.println("right->" + tree.right.value);

		return tree;
	}

	private static TreeNode createTree1(List<Integer> values, int index) {
		if (index >= values.size()) return null;
		return new TreeNode(values.get(index), createTree1(values, index * 2 + 1), createTree1(values, index * 2 + 2));
	}
}

class ListNode {
	public TreeNode data;
	public ListNode next;

	ListNode(TreeNode data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	ListNode(TreeNode data) {
		this(data, null);
	}
}

class TreeNode {

	public TreeNode left;
	public TreeNode right;
	public int value;

	TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	TreeNode(int value) {
		this(value, null, null);
	}
}
