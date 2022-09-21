package com.sk.string;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		// remove character from String

		String input = "sandeep";

		// if we want to remove d
		char ch = 'd';
		input.chars().filter(i -> i != ch).forEach(out -> {
			System.out.print((char) out + " ");
		});

		char[] charArray = input.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (ch != charArray[i])
				charArray[count++] = charArray[i];
		}
		// Now last element dublicte so set as empty
		charArray[charArray.length - 1] = ' ';
		String get = String.valueOf(charArray);
		System.out.println(get);

		// with the help of new variable
		String output = "";
		for (char loop : charArray) {
			if (ch != loop)
				output += loop;
		}
		System.out.println(output);
	}

}
