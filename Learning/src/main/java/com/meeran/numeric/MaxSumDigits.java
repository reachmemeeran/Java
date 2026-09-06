package com.meeran.numeric;

import java.util.ArrayList;
import java.util.List;

public class MaxSumDigits {
    public static long[] maxSumDig(long nmax, int maxsm) {
        List<Long> outList = new ArrayList<Long>();
        for (long i = 1000; i <= nmax; i++) {
            if (MaxSumDigits.valid(i, maxsm)) {
                outList.add(i);
            }
        }
        long sum = 0;
        for (Long x : outList) {
            sum += x;
        }
        long mean = sum / outList.size();
        long nearest = 0;
        if (outList.contains(mean)) {
            nearest = mean;
        } else {
            for (int i = 0; i < outList.size(); i++) {
                long temp = outList.get(i);
                if (temp < mean) {
                    continue;
                } else {
                    nearest = temp - mean > mean - outList.get(i - 1) ? outList.get(i - 1) : temp;
                    break;
                }
            }
        }
        return new long[] { outList.size(), nearest, sum };
    }

    private static Boolean valid(long num, int maxsm) {
        String str = String.valueOf(num);
        for (int i = 0; i <= str.length() - 4; i++) {
            int sum = 0;
            for (int j = i; j < i + 4; j++) {
                sum += str.charAt(j) - '0';
                if (sum > maxsm) {
                    return false;
                }
            }
        }
        return true;
    }
}
