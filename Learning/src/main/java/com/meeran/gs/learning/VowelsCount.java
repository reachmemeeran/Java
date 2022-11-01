package com.meeran.gs.learning;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result -  5   :"+getCount("abracadabra"));
		System.out.println("Result -  6   :"+getCount("abracadabraE"));
	    System.out.println("Result -  0   :"+getCount(""));
	    System.out.println("Result -  0   :"+getCount(null));
	    System.out.println("Result -  4   :"+getCount("pear tree"));
	    System.out.println("Result -  13  :"+getCount("o a kak ushakov lil vo kashu kakao"));
	    System.out.println("Result -  168 :"+getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
	}
	
	static int getCount(String str) {
		return str == null ? 0 : str.replaceAll("(?i)[^aeiou]", "").length();
	}

}
