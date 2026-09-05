package com.meeran.stringandpatterns;

public class MexicanWave {
    public static String[] wave(String str) {
        int len = str.replaceAll("\\s","").length();
        String[] waves = new String[len];
        for (int i=0,j=0; i<str.length(); i++,j++) {
            StringBuilder sb = new StringBuilder(str);
            while (Character.toString(str.charAt(i)).equals(" ")) {
                if (i+1 >= str.length()) return waves;
                i++;
            }
            sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            waves[j] = sb.toString();
        }
        return waves;
    }
}
