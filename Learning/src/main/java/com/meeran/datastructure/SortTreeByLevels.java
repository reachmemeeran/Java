package com.meeran.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

public class SortTreeByLevels {
	public static List<Integer> treeByLevels(SortTreeNode node) {
		// off ya go!
		if (node == null) return new LinkedList<>();
		List<Integer> treeValList = new LinkedList<>();
		Queue<SortTreeNode> queue = new LinkedList<SortTreeNode>();
		queue.add(node);
		while (!queue.isEmpty()) {
			SortTreeNode currentNode = queue.poll();
			treeValList.add(currentNode.value);
			if (currentNode.left != null) queue.add(currentNode.left);
			if (currentNode.right != null) queue.add(currentNode.right);
		}
		return treeValList;
	}

	@Test
	public void nullTest() {
		assertEquals(Arrays.asList(), SortTreeByLevels.treeByLevels(null));
	}

	@Test
	public void basicTest() {
		assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6),
				SortTreeByLevels.treeByLevels(new SortTreeNode(new SortTreeNode(null, new SortTreeNode(null, null, 4), 2),
						new SortTreeNode(new SortTreeNode(null, null, 5), new SortTreeNode(null, null, 6), 3), 1)));
	}
}

class SortTreeNode {
	int value;
	SortTreeNode left;
	SortTreeNode right;

	SortTreeNode() {
	}

	SortTreeNode(int val) {
		this.value = val;
	}

	SortTreeNode(SortTreeNode left, SortTreeNode right, int val) {
		this.value = val;
		this.left = left;
		this.right = right;
	}
}