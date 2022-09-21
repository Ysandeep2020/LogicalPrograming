package com.sk.string;

public class Permutation {
	public static String swap(String str, int f, int s) {
		char[] arr = str.toCharArray();
		char temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
		return String.valueOf(arr);
	}

	public static void permute(int pos, int length, String str) {

		// print all permutations
		if (pos == length - 1) {
			System.out.println(str);
		} else {

			for (int i = pos; i < length; i++) {
				// Swapping string by using by fixing a character
				str = swap(str, pos, i);
				// Recursily calling function generate permute() for rest of characters
				permute(pos + 1, length, str);
				// for backtracking and swapping the character
				str = swap(str, pos, i);

			}
		}
	}

	public static void main(String[] args) {
		// print all permutations of given String
		// fixed character and swap it
		String input = "ABC";
		permute(0, input.length(), input);
	}
}
