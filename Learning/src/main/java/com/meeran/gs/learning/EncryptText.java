package com.meeran.gs.learning;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncryptText {

	public static void main(String[] args) {
		System.out.println("Result -  " +encryptThis(""));
        System.out.println("Result - 65 119esi 111dl 111lw 108dvei 105n 97n 111ka " +encryptThis("A wise old owl lived in an oak"));
        System.out.println("Result - 84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp " +encryptThis("The more he saw the less he spoke"));
        System.out.println("Result - 84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare " +encryptThis("The less he spoke the more he heard"));
        System.out.println("Result - 87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri " +encryptThis("Why can we not all be like that wise old bird"));
        System.out.println("Result - 84kanh 121uo 80roti 102ro 97ll 121ruo 104ple " +encryptThis("Thank you Piotr for all your help"));
	}
	
	public static String encryptThis(String text) {
		return Arrays.stream(text.split(" "))
				.map(w->w.length()>2?(int)w.charAt(0)+w.substring(w.length()-1)+w.substring(2,w.length()-1)+w.substring(1,2):
					w.length()>1? (int)w.charAt(0)+w.substring(1):
						w.length()==1? (int)w.charAt(0)+"":"")
				.collect(Collectors.joining(" "));
    }

}
