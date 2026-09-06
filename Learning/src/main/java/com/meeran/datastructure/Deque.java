package com.meeran.datastructure;

import java.util.ArrayList;
import java.util.List;

/*
 *
Queue Method -> Equivalent Deque Method
add(e) -> addLast(e)
offer(e) -> offerLast(e)
remove() -> removeFirst()
poll() -> pollFirst()
element() -> getFirst()
peek() -> peekFirst()

Stack Method -> Equivalent Deque Method
push(e) -> addFirst(e)
pop() -> removeLast()
peek() -> peekFirst()

 * */
public class Deque {

	List<Integer> list = new ArrayList<>();

	public void addFirst(int a) {
		list.add(0, a);
	}

	public void addLast(int a) {
		list.add(list.size(), a);
	}

	public boolean removeFirst() {
		if(list.size()>0) {
			list.remove(0);
			return true;
		}else return false;
	}

	public boolean removeLast() {
		if(list.size()>0) {
			list.remove(list.size()-1);
			return true;
		}else return false;
	}

	public int peekFirst() {
		if(list.size()>0) return list.get(0);
		else return -1;
	}

	public int peekLast() {
		if(list.size()>0) return list.get(list.size()-1);
		else return -1;
	}
}
