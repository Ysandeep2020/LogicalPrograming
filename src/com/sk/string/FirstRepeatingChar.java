package com.sk.string;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {

	public static void byInbuiltMethod(String input) {

		// by indexOf() and lastIndexOf() methods
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) != input.lastIndexOf(c)) {
				System.out.println("First repeating Char is " + c);
				break;
			}
		}
	}

	public static void byHashSet(String input) {
		// by HashSet
		Set<Character> set = new HashSet<Character>();
		char[] arr = input.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (set.contains(c)) {
				System.out.println("First repeated Char is  " + c);
				break;
			} else
				set.add(c);
		}
	}

	public static void byNestedLoop(String input) {
		// input: ramanuzum
		// output: a
		// input: hello sandeep
		// output: e
		// By Nested Loop
		boolean flag = false;
		char[] arr = input.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("First repeating Char is " + arr[i]);
					flag = true;
					break;
				}
			}
			if (flag == true)
				break;
		}
	}

	public static void byLoop(String input) {
		// input: geeksforgeeks
		// output: e
		// input: hello sandeep
		// output: l
		// By Nested Loop
		boolean flag = false;
		char[] arr = input.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("First repeating Char is " + arr[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {

		// first repeating char given String
		String input = "helo sandeep";
		byHashSet(input);
	}
}
