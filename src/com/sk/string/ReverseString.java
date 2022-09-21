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

	public static String reverseRecursively(String str) {
		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}
		// here we remove or pick 1st element and add into last in every condition.
	//	 String s=str.substring(1) + str.charAt(0);
		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

	public static String iterative(String str) {
		StringBuffer buffer = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			buffer.append(str.charAt(i));
		}
		return buffer.toString();
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
		System.out.println(reverseRecursively(new1));
		System.out.println(iterative(new1));
		System.out.println(reverse(name));
		System.out.println(reverseWrods(new1));
	    reverseWordInGivenSentence(new1);
	}

	private static void reverseWordInGivenSentence(String new1) {
		// TODO Auto-generated method stub
		
	}
}
