package com.meeran.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class MaxSumDigitsTest {

    private static void testing(long nmx, int mxsm, long[] res) {
        assertEquals(Arrays.toString(res),
                Arrays.toString(MaxSumDigits.maxSumDig(nmx, mxsm)));
    }

    @Test
    public void test() {
        System.out.println("Basic Tests");
        testing(2000, 3, new long[] {11, 1110, 12555});
        testing(2000, 4, new long[] {21, 1120, 23665});
        testing(2000, 7, new long[] {85, 1200, 99986});
        testing(3000, 7, new long[] {141, 1600, 220756});
        testing(4000, 4, new long[] {35, 2000, 58331});
        testing(5000, 2, new long[] {5, 1100, 6111});
        testing(5000, 3, new long[] {15, 1200, 21666});
        testing(5000, 4, new long[] {35, 2000, 58331});
        testing(5000, 5, new long[] {70, 2000, 132216});
        testing(5000, 6, new long[] {122, 2010, 244875});
        testing(5000, 7, new long[] {196, 2110, 413306});
        testing(5000, 8, new long[] {296, 2200, 649951});
        testing(5000, 9, new long[] {426, 2250, 967696});
    }

    private static int sumDigitsStrSol(String[] s) {
        int result = 0;
        for (int i = 0; i < s.length; i++)
            result += Integer.parseInt(s[i], 10);
        return result;
    }

    private static List<Long> maxSumDigAuxSol(long nmax, int maxsm) {
        List<Long> res = new ArrayList<Long>();
        long i = 1000;
        while (i <= nmax) {
            String[] a = String.valueOf(i).split("");
            int j = 0, b = 0;
            while (j <= a.length - 4) {
                String[] slice = Arrays.copyOfRange(a, j, j+4);
                long s = sumDigitsStrSol(slice);
                if (s <= maxsm) b++;
                j++;
            }
            if (b == j) res.add(i);
            i++;
        }
        return res;
    }

    private static long[] maxSumDigSol(long nmax, int maxsm) {
        long[] result = new long[3];
        List<Long> res = maxSumDigAuxSol(nmax, maxsm);
        int l = res.size(); long s = 0; double m = 0; double mn = Double.MAX_VALUE; long val = 0;
        for (int i = 0; i < l; ++i) {
            s += res.get(i);
        }
        m = s / (double)l;
        for (int i = 0; i < l; ++i) {
            long u = res.get(i);
            double v = Math.abs(u - m);
            if (v < mn) {
                mn = v;
                val = u;
            }
        }
        result[0] = l; result[1] = val; result[2] = s;
        return result;
    }

    private static int randint(Random rnd, int min, int max) {
        int randomNumber = rnd.nextInt(max - min) + min;
        return randomNumber;
    }

    private static void wTests1()
    {
        for (int i = 0; i < 20; i++) {
            Random rnd = new Random();
            long nmx = randint(rnd, 2000, 100000);
            int mxsm = randint(rnd, 2, 8);
            assertEquals(Arrays.toString(maxSumDigSol(nmx, mxsm)),
                    Arrays.toString(MaxSumDigits.maxSumDig(nmx, mxsm)));
        }
    }

    @Test
    public void tests1() {
        System.out.println("Random Tests 1 ****");
        wTests1();
    }
}
