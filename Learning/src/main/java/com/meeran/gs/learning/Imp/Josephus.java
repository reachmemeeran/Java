package com.meeran.gs.learning.Imp;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
        int k = 2;
        System.out.println("The chosen place is 13 "
                           + josephus1(n, k));
        
        System.out.println("The chosen place is 3 "
                + josephus1(5, 2));
	}
	static int josephus(int n, int k) {
		Deque<Integer> deque = new LinkedList<Integer>();
		for(int i=1;i<n;i++) {
			deque.offer(i);
		}
		while(deque.size()>1) {
			for(int i=0;i<k;i++) {
				deque.offer(deque.remove());
			}
			deque.remove();
		}
		return deque.remove();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int josephus1(int n, int k) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) queue.offer(i);
		
		while(queue.size()>1) {
			int delete = k-1;
			while(delete>0) {
				queue.offer(queue.remove());
				delete--;
			}
			queue.remove();
		}
		return queue.remove();
	}
	
	static int josephusc2(int n, int k) {
		if(n==1) return 1;
		else
			return (josephus(n-1,k)+k-1)%n+1;
	}

}
