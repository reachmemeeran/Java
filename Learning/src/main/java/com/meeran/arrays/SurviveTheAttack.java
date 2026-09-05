package com.meeran.arrays;

import java.util.Arrays;

public class SurviveTheAttack {
	public static boolean block(int[] attackers, int[] defenders){
		int attackLength = attackers.length, defLength = defenders.length;
		int attackSurv = 0, defSurive = 0, attackSum = 0, defSum = 0;
		int length = defLength;
		if (attackLength >= defLength) length = attackLength;
		for(int i = 0; i < length; i++) {
			if(i < attackLength && i < defLength) {
				if(attackers[i] > defenders[i]) attackSurv += 1;
				else defSurive += 1;
				if(i == 0) {
					if(Arrays.stream(attackers).sum() > Arrays.stream(defenders).sum()) attackSum += 1;
					else if (Arrays.stream(attackers).sum() < Arrays.stream(defenders).sum()) defSum += 1;
				}
			} else if (i < attackLength && i >= defLength) attackSurv += 1;
			else if (i >= attackLength && i < defLength) defSurive += 1;
		}
		return defSurive > attackSurv ? true : defSurive == attackSurv ? (defSum >= attackSum ? true : false) : false;
	}
}
