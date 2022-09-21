package com.sk.string;

public class PalindromeOrNot {
	public static void main(String[] args) {
		String input = "ratar";
		System.out.println(plaindrome(input));
	}

	private static boolean plaindrome(String input) {
		// check given string is palindrome or not
		// check reverse of string
		if (input.equals(reverse(input)))
			return true;
		else
			return false;
	}

	private static String reverse(String input) {
		String rev = "";
		if (input != null && input != "") {
			for (int i = input.length() - 1; i >= 0; i--) {
				rev += input.charAt(i);
			}
		}
		return rev;
	}
}
