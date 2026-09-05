package com.meeran.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TweleveCardGame {
	public static boolean game(int[] frank, int[] sam, int[] tom) {
		return ((frank[3] > Math.max(sam[3], tom[3]) && frank[2] > Math.max(sam[2], tom[2]))
				|| (frank[3] > Math.max(sam[2], tom[2]) && frank[2] > Math.max(sam[1], tom[1]))
				|| (frank[3] > Math.max(sam[1], tom[1]) && frank[2] > Math.max(sam[0], tom[0]))) ? true : false;
	}

	public static boolean game1(int[] frank, int[] sam, int[] tom) {
		List<Integer> samList = IntStream.of(sam).boxed().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		List<Integer> tomList = IntStream.of(tom).boxed().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		Arrays.sort(frank);
		int i = frank.length, count = 0, fail = 0;
		while (i-- >= 0) {
			samList = getLeastNum(frank[i], samList);
			tomList = getLeastNum(frank[i], tomList);
			if (i == samList.size() && i == tomList.size())
				count++;
			else
				fail++;
			if (fail > 1 && fail > count)
				return false;
			else if (count > 1)
				return true;
		}
		return false;
	}

	private static List<Integer> getLeastNum(int frankNum, List<Integer> player) {
		for (int i = 0; i < player.size(); i++) {
			if (frankNum > player.get(i)) {
				player.remove(i);
				break;
			}
		}
		return player;
	}
}
