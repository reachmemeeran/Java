package com.meeran.datastructure;

import java.util.Stack;

public class QueueImplementationUsingStack {

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> outputStack = new Stack<>();

	public void add(int x) {
		stack.push(x);
	}

	public int peek() {
		if(outputStack.isEmpty()) {
			while(!stack.isEmpty()) {
				outputStack.add(stack.pop());
			}
		}
		return outputStack.isEmpty() ? -1 : outputStack.peek();
	}

	public boolean remove() {
		peek();
		if(outputStack.isEmpty()) return false;
		else {
			outputStack.pop();
			return true;
		}
	}

	public Boolean isEmpty() {
		return stack.isEmpty() && outputStack.isEmpty();
	}
}
