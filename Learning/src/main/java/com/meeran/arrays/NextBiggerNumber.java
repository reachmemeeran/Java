package com.meeran.arrays;

import java.util.Arrays;

public class NextBiggerNumber {
    public static long nextBiggerNumber(long n) {
        char digitList[] = convertNoToArray(n);
        int length = digitList.length;
        int i;
        String result = "";
        for (i = length - 1; i > 0; i--) {
            if (digitList[i] > digitList[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            return -1;
        } else {
            int x = digitList[i - 1], min = i;
            for (int j = i + 1; j < length; j++) {
                if (digitList[j] > x && digitList[j] < digitList[min]) {
                    min = j;
                }
            }
            swap(digitList, i - 1, min);
            Arrays.sort(digitList, i, length);
            for (i = 0; i < length; i++) result += digitList[i];
        }
        return Long.parseLong(result);
    }

    public static char[] convertNoToArray(long n) {
        String stringN = Long.toString(n);
        char digits[] = new char[stringN.length()];
        for (int c=0; c<stringN.length(); c++) digits[c] = stringN.charAt(c);
        return digits;
    }

    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
