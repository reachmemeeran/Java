package com.meeran.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue {

	Queue<Integer> queue = new LinkedList<Integer>();
	Queue<Integer> OutputQueue = new LinkedList<Integer>();
	int top;

	public void push(int x) {
		queue.add(x);
		top = x;
	}

	public int peek() {
		if(queue.isEmpty()) return -1;
		else return top;
	}

	public boolean pop() {
		if(queue.isEmpty()) return false;
		OutputQueue.clear();
		while(queue.size() > 1) {
			top = queue.remove();
			OutputQueue.add(top);
		}

		Queue<Integer> temp = queue;
		queue = OutputQueue;
		OutputQueue = temp;
		return true;
	}

	public Boolean isEmpty() {
		return queue.isEmpty() && OutputQueue.isEmpty();
	}
}
