package com.meeran.numeric;

public class FindTheSmallest {
    public static long[] smallest(long n) {
        // your code

        long smallest = n, indexI=0,indexJ=0;
        String ipStr = String.valueOf(n);
        for(int i=0; i<ipStr.length();i++) {
            for(int j=0; j<ipStr.length(); j++) {
                long shift_Num = shiftDigit(ipStr, i, j);
                if(i!=j && shift_Num < smallest) {
                    smallest = shift_Num;
                    indexI=i;
                    indexJ=j;
                }
            }
        }
        return new long[]{smallest,indexI, indexJ};
    }

    private static long shiftDigit(String ipStr, int i, int j) {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder(ipStr);
        char ch = sb.charAt(i);
        sb.deleteCharAt(i);
        sb.insert(j, ch);
        return Long.valueOf(sb.toString());
    }
}
