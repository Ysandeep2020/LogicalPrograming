package com.sk.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CheckAnagramByHashMap {

	public static void main(String[] args) {
		String input1 = "mary";
		String input2 = "army";

		checkAnagram(input1.toCharArray(), input2.toCharArray());
	}

	private static boolean checkAnagram(char[] a, char[] b) {
		// using HashMap
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// loop over string a
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else
				map.put(a[i], 1);
		}
		// map = m 1 ,a 1, r 1, y 1
		// now we reduce map value

		for (int i = 0; i < b.length; i++) {
			if (map.containsKey(b[i])) {
				map.put(b[i], map.get(b[i]) - 1);
			}
		}
		// here map a 0 r 0 m 0 y0
		// if any other then zero then return false

		long count = map.entrySet().stream().filter(t -> t.getValue() != 0).count();
		if (count != 0)
			return false;

		return true;
	}
}
