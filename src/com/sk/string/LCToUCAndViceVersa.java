package com.sk.string;

public class LCToUCAndViceVersa {
	public static void main(String[] args) {

		String input = "Great Power";
		String output = "";

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				// convert to uppercase
				char ch = (char) ((int) input.charAt(i) - 32);
				output += ch;
			} else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				char ch = (char) ((int) input.charAt(i) + 32);
				output += ch;
			} else {
				output += input.charAt(i);
			}
		}

		System.out.println(output);

	}
}
