package com.meeran.gs.learning;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Syntax {
	public static void main(String[] args) {
		
		
		//Sort Map by values
		
		Map<String, String> country = new HashMap<String,String>();
		country.put("India", "New Delhi");
        country.put("USA", "Washington D.C.");
        country.put("Japan", "Tokyo");
        country.put("China", "Beijing");
        country.put("Australia", "Melb");
        
        country = country.entrySet()
        		.stream()
        		.sorted(Map.Entry.comparingByValue())
        		.collect(Collectors.toMap(
        				Map.Entry::getKey,
        				Map.Entry::getValue,
        				(oldValue,newValue) -> newValue,
        				LinkedHashMap::new
        				));
        System.out.println("sorted value-->"+country.toString());
        
        country = country.entrySet()
        		.stream()
        		.sorted(Map.Entry.comparingByKey())
        		.collect(Collectors.toMap(
        				Map.Entry::getKey,
        				Map.Entry::getValue,
        				(oldKey,newKey) -> newKey,
        				LinkedHashMap::new
        				));
        System.out.println("sorted key-->"+country.toString());
        
	}
}
