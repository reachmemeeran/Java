package com.meeran.gs.learning.Imp;

import java.util.Deque;
import java.util.LinkedList;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Result - true " + validParentheses("{[()]}"));
		  System.out.println("Result - true " + validParentheses("{{[[(())]]}}"));
		  System.out.println("Result - true " + validParentheses("[]{}"));
		  System.out.println("Result - false " + validParentheses("{[(])}"));
		  System.out.println("Result - false " + validParentheses("[({}"));
		  System.out.println("Result - false " + validParentheses("[]}"));
		  System.out.println("Result - false " + validParentheses("[}]"));
		  System.out.println("Result - false " + validParentheses(""));
		  System.out.println("Result - false " + validParentheses(null));
	}

	
	public static boolean validParentheses(String parens) {
		if(parens==null || parens.length()<=0) return false;
		Deque<Character> deque = new LinkedList<Character>();
		for(Character ch : parens.toCharArray()) {
			if(ch=='{' || ch=='[' || ch=='(') deque.offer(ch);
			else if (!deque.isEmpty() && ((ch=='}' && deque.peekLast()=='{') || (ch==']' && deque.peekLast()=='[') || 
					(ch==')' && deque.peekLast()=='('))) deque.removeLast();
			else return false;
		}
		return deque.isEmpty() ? true : false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean validParentheses1(String parens) {
		if(parens==null)return false;
		Deque<Character> deque = new LinkedList<>();
		for (char ch : parens.toCharArray()) {
			if (ch == '{' || ch == '[' || ch == '(') deque.add(ch);
			else {
				if (!deque.isEmpty()) {
					if ((deque.peekLast() == '{' && ch == '}') 
							|| (deque.peekLast() == '[' && ch == ']')
							|| (deque.peekLast() == '(' && ch == ')')) {
						deque.removeLast();
					} else return false;
				} else return false;
			}
		}
		return deque.isEmpty() ? true : false;
	}

}
