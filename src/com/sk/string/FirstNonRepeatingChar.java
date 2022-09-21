package com.sk.string;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String input = "geeksforgeeks";
		System.out.println("==========Custom Way==========");
		findFirstNonRepeatingBycustom(input);
		System.out.println("  ========InBuild Methods========");
		firstNonRepeatCharInbuild(input);
	}

	private static void firstNonRepeatCharInbuild(String input) {
		char[] charArray = input.toCharArray();
		for (char ch : charArray) {
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println("Non Repating Character is " + ch);
				break;
			}
		}
	}

	private static void findFirstNonRepeatingBycustom(String input) {
		// input="
		char[] array = input.toCharArray();
		// outer loop for iterate all string character
		for (int i = 0; i < input.length(); i++) {
			boolean flag = false;
			// here we match every char
			for (int j = i + 1; j < input.length(); j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("First Repeating Character is " + array[i]);
				break;
			}
		}
	}
}
