package com.meeran.dynamicprogramming;

import java.util.LinkedList;
import java.util.Queue;

public class StudentElection {

	public static int whoIsElected(int n, int k) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) queue.offer(i);

		while(queue.size() > 1) {
			for(int delete = k - 1; delete > 0; delete--) {
				queue.offer(queue.remove());
			}
			queue.remove();
		}
		return queue.remove();
	}

	public static int josephus(int n, int k) {
		if(n == 1) return 1;
		else
			return (josephus(n - 1, k) + k - 1) % n + 1;
	}
}
