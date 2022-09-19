package com.sk.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static String reverse(String str) {
		// Reverse String
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev += str.charAt(str.length() - 1 - i);
		}
		return rev;
	}

	public static List<String> reverseWrods(String str) {

		String[] split = str.split("");
		String[] out = new String[split.length];
		for (int i = 0; i < split.length; i++) {
			out[i] = reverse(split[i]);
		}
		return Arrays.asList(out);
	}

	public static void main(String[] args) {
		String name = "sandeep";
		String new1 = "Hello sandeep Yadav";
		System.out.println(reverse(name));
		System.out.println(reverseWrods(new1));
	}
}
