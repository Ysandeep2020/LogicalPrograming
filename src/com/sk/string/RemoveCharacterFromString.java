package com.sk.string;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		// remove character from String

		String input = "sandeep";
		System.out.println(removeChar(input, 1));

		// if we want to remove d
//		char ch = 'd';
//		input.chars().filter(i -> i != ch).forEach(out -> {
//			System.out.print((char) out + " ");
//		});

	}

	private static String removeChar(String input, int pos) {
		// here we remove char based on pos
		return input.substring(0, pos) + input.substring(pos + 1, input.length());
	}

}
