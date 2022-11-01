package com.meeran.gs.learning;

// Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and 
// above with '1'. Return the resulting string.
public class FakeBinary {

	public static void main(String[] args) {
		System.out.println("Result - "+ "01011110001100111 "+ fakeBin("45385593107843568"));
	      System.out.println("Result - "+ "101000111101101 "+ fakeBin("509321967506747")); 
	      System.out.println("Result - "+ "011011110000101010000011011 "+ fakeBin("366058562030849490134388085"));

	}
	
	public static String fakeBin1(String numberString) {
		
		String output="";
		for(Character ch : numberString.toCharArray()) {
			if(ch <'5') {
				output+=0;
			}else {
				output+=1;
			}
		}
        return output;
    }
	
	public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
	
}
