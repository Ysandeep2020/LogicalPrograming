package com.sk.string;

import java.util.Arrays;
import java.util.List;

public class SwapingCharacter {

	public static void main(String[] args) {
		String input = "ABC";
		// output must be BAC
		int f = 0;
		int s = 1;
		System.out.println(swap(input, f, s));

	}

	private static String swap(String input, int f, int s) {
		char[] arr = input.toCharArray();
		// with the help of Array we swap
		char temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
		return String.valueOf(arr);
	}

}
