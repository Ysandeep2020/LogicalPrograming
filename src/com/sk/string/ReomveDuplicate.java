package com.sk.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReomveDuplicate {
	public static Set<Character> byHashSet(String input) {
		Set<Character> set = new HashSet<Character>();
		for (char ch : input.toCharArray()) {
			set.add(ch);
		}
		return set;
	}

	public static List<Character> byJava8(String input) {
		return input.chars().distinct().mapToObj(obj -> (char) obj).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		
		// Remove Duplicate
		String input = "skjgkkskskksa";
		// 1 using HashSet
		System.out.println("Using HashMap -> " + byHashSet(input));
		// 2 using java 8
		System.out.println("Using Java8 -> " + byJava8(input));

		System.out.println("Using Custom Way -> " + byCustom(input));
	}

	private static String byCustom(String input) {
		// String input = "skjgkkskskksa";
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					// then remove j position element
					input = input.substring(0, j) + input.substring(j + 1, input.length());
					j--;
				}
			}
		}
		return null;
	}

}
