package com.meeran.datastructure;

public class SortUsingStack {

	public static void sortStack(StackByArrayList<Integer> stack) {
		StackByArrayList<Integer> tempStack = new StackByArrayList<>();

		while(!stack.isEmpty()) {
			int current = stack.pop();
			while(!tempStack.isEmpty() && tempStack.peek() > current) {
				stack.push(tempStack.pop());
			}
			tempStack.push(current);
		}
		while(!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
	}
}
