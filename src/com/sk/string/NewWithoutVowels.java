package com.sk.string;

public class NewWithoutVowels {

	public static void main(String[] args) {
		String input = "geeksforgeeks pOrtal";
		// Given a string, create a new string without vowels and print that string.
		System.out.println(getWihoutVowels(input));
		System.out.println(input.length() - getWihoutVowels(input).length());
	}

	private static String getWihoutVowels(String input) {
		String reverse = "";
		for (char ch : input.toLowerCase().toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				continue;
			else
				reverse += ch;
		}

		return reverse;
	}

}
