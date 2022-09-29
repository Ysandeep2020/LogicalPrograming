package com.sk.string;

public class CountVowels {

	public static int countVowels(String str) {
		int count = 0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
//		String input = "abc de";

		// Output : 2

		String input = "geeksforgeeks pOrtal";
		// Output : 7
		System.out.println(countVowels(input));
	}
}
