package com.meeran.datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SortTreeByLevels {
	public static List<Integer> treeByLevels(Node node) {
		// off ya go!
		if (node == null) return new LinkedList<>();
		List<Integer> treeValList = new LinkedList<>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (!queue.isEmpty()) {
			Node currentNode = queue.poll();
			treeValList.add(currentNode.value);
			if (currentNode.left != null) queue.add(currentNode.left);
			if (currentNode.right != null) queue.add(currentNode.right);
		}
		return treeValList;
	}
}
