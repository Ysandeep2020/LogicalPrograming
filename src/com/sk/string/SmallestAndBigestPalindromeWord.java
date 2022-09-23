package com.sk.string;

public class SmallestAndBigestPalindromeWord {

	public static void main(String[] args) {
		// find smallest and biggest word in given string
		String input = "wow you own kayak";

		findSmallAndBigWrod(input);

	}

	private static void findSmallAndBigWrod(String input) {
		String[] split = input.split(" ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int countChar = 0;
		for (int i = 0; i < split.length; i++) {
			if (isPalindrome(split[i])) {
				countChar += split[i].length();
			}
		}
		System.out.println("Count palindrome character in given string " + countChar);
		int count = 0;
		for (int i = 0; i < split.length; i++) {
			if (isPalindrome(split[i])) {
				count++;
			}
		}
		System.out.println("Count palindrome word in given string " + count);
		for (int i = 0; i < split.length; i++) {
			if (isPalindrome(split[i])) {
				if (max < split[i].length())
					max = i;
				if (min > split[i].length())
					min = i;
			}
		}

		System.out.println("Smallest :" + min + " Biggest :" + max);
	}

	public static boolean isPalindrome(String str) {
		String reverse = reverse(str);
		if (str.equals(reverse))
			return true;
		else
			return false;
	}

	private static String reverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

}
