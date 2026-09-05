package com.meeran.numeric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
	public static Map<String, List<Integer>> getPeaks(int[] arr) {
		Map<String, List<Integer>> output = new HashMap<>();
		List<Integer> posList = new ArrayList<>();
		List<Integer> peaksList = new ArrayList<>();
		int pos = Integer.MIN_VALUE;
		int peak = Integer.MIN_VALUE;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] < arr[i]) {
				pos = i;
				peak = arr[i];
			}
			if(arr[i-1] > arr[i] && pos != Integer.MIN_VALUE) {
				posList.add(pos);
				peaksList.add(peak);
				pos = Integer.MIN_VALUE;
			}
		}
		output.put("pos", posList);
		output.put("peaks", peaksList);
		return output;
	}
}
