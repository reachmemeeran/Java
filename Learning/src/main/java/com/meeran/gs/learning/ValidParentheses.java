package com.meeran.gs.learning;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("Result - true " +validParentheses( "()" ));  
	  System.out.println("Result - false " +validParentheses( "())" ));
	  System.out.println("Result - true " +validParentheses( "32423(sgsdg)" ));  
	  System.out.println("Result - false " +validParentheses( "(dsgdsg))2432" ));
	  System.out.println("Result - true " +validParentheses( "adasdasfa" ));
	}
	
	public static boolean validParentheses(String parens){
	    //Put code below
		int count=0;
		for(Character ch : parens.toCharArray()) {
			if(ch=='(') count++;
			else if(ch==')') count--;
			if(count<0) return false;
		}
		return count==0 ? true : false;	
	  }

}
