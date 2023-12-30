package day15_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class MapsInSession {

public static void main(String[] args) {
		
		
		HashMap<String,String>  worldMapCapital = new HashMap<String,String>(); 
		
		worldMapCapital.put("Germany", "Berlin");
		worldMapCapital.put("India", "Delhi");
		worldMapCapital.put("USA", "DC");
		worldMapCapital.put("Turkey", "Ankara");
		worldMapCapital.put("Croatia", "Zaghreb");
		worldMapCapital.put("England", "London");
		worldMapCapital.put("UK", "London");
		worldMapCapital.put(null, "Antarctica");
		worldMapCapital.put(null, "Fiji");
		worldMapCapital.put("Russia", null);
		worldMapCapital.put("Netherlands", null);
		
		
		//System.out.println(worldMapCapital);
		
		//System.out.println(worldMapCapital.get("Russia"));
		
		
		// How to iterate HashMap
		// 1. For Each Loop
		
		System.out.println("**************** For Each Loop *****************");
		Set<String> keys = worldMapCapital.keySet();
		
		for(String str:keys) {
			
			//System.out.println("Country :"+str + " and Captials :"+worldMapCapital.get(str));
			
		}
		
		//2. Iterator with keyset
		
		System.out.println("**************** Iterator with keyset *****************");
		Iterator<String> itr1=worldMapCapital.keySet().iterator();
		
		while(itr1.hasNext()) {
			
			String keyss=itr1.next();
			
			//System.out.println("Country :"+keyss + " and Captials :"+worldMapCapital.get(keyss));
			
		}
		
		//3. Iterator with entry set
		System.out.println("**************** Iterator with entry set *****************");
		Iterator<Entry<String, String>> itr2=worldMapCapital.entrySet().iterator();

		while(itr2.hasNext()) {
			
			Entry<String, String> entry= itr2.next();
			
			//System.out.println("Country :"+entry.getKey() + " and Captials :"+entry.getValue());		
			
		}
		System.out.println("**************** Lamda *****************");

		//4. Iterator with lambda
		
		//worldMapCapital.forEach((k,v) -> System.out.println("Country :"+k + " and Captials :"+v));
		
		
		
		// Comparing two maps: -
		HashMap<Integer, String> mappers = new HashMap<Integer, String>();
		mappers.put(1, "Priyanshi");
		mappers.put(2, "Kanupriya");
		mappers.put(3, "Priyanshi");
		//mappers.put(3, "Uday");
		
		HashMap<Integer, String> mapper2 = new HashMap<Integer, String>();
		mapper2.put(2, "Kanupriya");
		mapper2.put(3, "Priyanshi");
		mapper2.put(1, "Priya");		
		
		HashMap<Integer, String> mapper3 = new HashMap<Integer, String>();
		mapper3.put(1, "Priya");
		mapper3.put(2, "Kanupriya");
		mapper3.put(3, "Pri");
		mapper3.put(4, "Priyanshi");
		
		
		// 1. Comparing Based on key value / whole Map
		/*
		System.out.println(mappers.equals(mapper2));
		System.out.println(mappers.equals(mapper3));
		
		// 2. Comparing Based on key
		System.out.println(mappers.keySet().equals(mapper2.keySet()));
		System.out.println(mappers.keySet().equals(mapper3.keySet()));
		
		// Q. How to find extra key from two maps?	
		
		HashSet<Integer> hsh= new HashSet<Integer>(mappers.keySet());
		HashSet<Integer> hsh1= new HashSet<Integer>(mapper3.keySet());
		
		hsh1.removeAll(hsh);
		System.out.println(hsh1);
		
		// 3. Comparing based on value
		
		System.out.println(mappers.values().equals(mapper2.values()));
		System.out.println(mappers.values().equals(mapper3.values()));
			*/
		
		HashSet<String> forMap1= new HashSet<String>();
		HashSet<String> forMap2= new HashSet<String>();
		HashSet<String> forMap3= new HashSet<String>();
		
		// Case 1:  Where duplicate values are not allowed
		forMap1.addAll(mappers.values());
		forMap2.addAll(mapper2.values());
		forMap3.addAll(mapper3.values());
		System.out.println(forMap1);
		System.out.println(forMap1.equals(forMap2));
		
		System.out.println(forMap1.equals(forMap3));
			
		
		// // Case 2:  Where duplicate values are allowed
		
		ArrayList<String> ListforMap1= new ArrayList<String>();
		ArrayList<String> ListforMap2= new ArrayList<String>();
		ArrayList<String> ListforMap3= new ArrayList<String>();
		
		ListforMap1.addAll(mappers.values());
		ListforMap2.addAll(mapper2.values());
		ListforMap3.addAll(mapper3.values());
		
		Collections.sort(ListforMap1);
		Collections.sort(ListforMap2);
		Collections.sort(ListforMap3);
		System.out.println(ListforMap1);
		System.out.println(ListforMap1.equals(ListforMap2));
		System.out.println(ListforMap1.equals(ListforMap3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

