package com.meeran.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
	public static List<Object> filterList(final List<Object> list) {
		// Return the List with the Strings filtered out
		List<Object> output = new ArrayList<Object>() ;
		for(int i=0; i<list.size();i++) {
			if(list.get(i) instanceof Number) output.add(list.get(i));
		}
		return output;
	}
}
