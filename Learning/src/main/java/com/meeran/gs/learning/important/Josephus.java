package com.meeran.gs.learning.important;

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
                + josephus2(5, 2));
	}
	static int josephus(int n, int k) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) queue.offer(i);
		
		while(queue.size()>1) {
			
			for(int delete=k-1; delete>0; delete--) {
				queue.offer(queue.remove());
			}
			queue.remove();
		}
		return queue.remove();
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
	
	static int josephus2(int n, int k) {
		if(n==1) return 1;
		else
			return (josephus(n-1,k)+k-1)%n+1;
	}

}
