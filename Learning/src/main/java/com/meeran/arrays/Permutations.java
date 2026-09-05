package com.meeran.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Permutations {
    public static List<String> singlePermutations(String s) {
        TreeSet<String> outputSet = new TreeSet<String>();
        List<String> outputList = new ArrayList<String>();
        permutation(0, new StringBuilder(s), outputSet);
        outputList.addAll(outputSet);
        return outputList;
    }

    private static void permutation(int index, StringBuilder sb, TreeSet<String> outputSet) {
        if (index == sb.length()) {
            outputSet.add(sb.toString());
        } else {
            for (int i = index; i < sb.length(); i++) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(index));
                sb.setCharAt(index, temp);
                permutation(index + 1, new StringBuilder(sb), outputSet);
                temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(index));
                sb.setCharAt(index, temp);
            }
        }
    }
}
