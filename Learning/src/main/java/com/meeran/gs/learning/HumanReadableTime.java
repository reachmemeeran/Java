package com.meeran.gs.learning;

public class HumanReadableTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result - "+ "makeReadable(0)" + "00:00:00 is "+makeReadable(0));
	    System.out.println("Result - "+ "makeReadable(5)" + "00:00:05 is "+makeReadable(5));
	    System.out.println("Result - "+ "makeReadable(60)" + "00:01:00 is "+makeReadable(60));
	    System.out.println("Result - "+ "makeReadable(86399)" + "23:59:59 is "+makeReadable(86399));
	    System.out.println("Result - "+ "makeReadable(359999)" + "99:59:59 is "+makeReadable(359999));
	}
	public static String makeReadable(int seconds) {
	    // Do something
	    return String.format("%02d:%02d:%02d", seconds/60/60 , seconds/60%60, seconds%60);
	  }
}
