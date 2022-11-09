package com.meeran.gs.learning.important;

public class DistinctIngredients {
	public static void main(String Args[]) {
		String str = "ABABCABABCD";
		System.out.println("A,B,*,C,*,D Distinct Ingredients for the Strig "+str+" is "+getDistinctIngredients(str));
		str = "ABCABCEA";
		System.out.println("A,B,C,*,E,A Distinct Ingredients for the Strig "+str+" is "+getDistinctIngredients(str));
		str = "A";
		System.out.println("A Distinct Ingredients for the Strig "+str+" is "+getDistinctIngredients(str));
		str = "aabbccbbccaabbccbbcc";
		System.out.println("a,*,b,b,c,c,b,b,c,c,* Distinct Ingredients for the Strig "+str+" is "+getDistinctIngredients(str));

	}
	
	static String getDistinctIngredients(String str) {
		StringBuilder output = new StringBuilder();
		output.append(str.charAt(0)+",");
		int i=1;
		while(i<str.length()) {
			if(str.charAt(0)==str.charAt(i)) {
				if(2*i<=str.length() &&  str.substring(0, i).equals(str.substring(i, 2*i))) {
					output.append("*,");
					i+=i;
				}else {
					output.append(str.charAt(i)+",");
					i++;
				}
			}else {
				output.append(str.charAt(i)+",");
				i++;
			}
		}
		return output.toString().substring(0,output.length()-1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static String getDistinctIngredients1(String str) {
		StringBuilder resultStr = new StringBuilder();
		
		resultStr.append(str.charAt(0));
		int i=1;
		while(i<str.length()) {
			if(str.charAt(0)==str.charAt(i)) {
				if(2*i <= str.length() && str.substring(0, i).equals(str.substring(i, 2*i))) {
					resultStr.append(',');
					resultStr.append('*');
					i+=i;
					continue;
				}else {
					resultStr.append(',');
					resultStr.append(str.charAt(i));
					i++;
					continue;
				}
			}else {
				resultStr.append(',');
				resultStr.append(str.charAt(i));
				i++;
				continue;
			}
		}
		return resultStr.toString();
	}
}