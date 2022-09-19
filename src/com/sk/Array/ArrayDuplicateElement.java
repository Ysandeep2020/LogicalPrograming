package com.sk.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArrayDuplicateElement {
	public static void main(String[] args) {

		// int[] arr = { 2, 5, 8, 6, 6, 9, 4 ,4,9};
		String[] arr = { "java", "C", "php", "java", "python", "java" };

//		 for (int i = 0; i < arr.length; i++) {
//		            
//			 for (int j = i+1; j < arr.length; j++) {
//			          if(arr[i]==arr[j]) System.out.println("Duplicate "+arr[i]);	
//			}
//		}

		// HashSet
		Set<String> set = new HashSet<>();
		for (String s : arr) {
			boolean add = set.add(s);
			if (add == false)
				System.out.println("Duplicate are " + s);
		}

		// HashMap
		Map<String, Integer> map = new TreeMap<>();
		for (String key : arr) {
			if (map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);
		}

		System.out.println(map);
		
	}

}
