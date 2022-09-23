package com.sk.string;

public class SmallestLargestWord {
	public static void main(String[] args) {

		// small word and big word into given string

		String input = "Hardships often prepare ordinary people for an extraordinary destiny";
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String smallest = null;
		String biggest = null;
		String[] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i].length()) {
				min = arr[i].length();
				smallest = arr[i];
			}
			if (max < arr[i].length()) {
				max = arr[i].length();
				biggest = arr[i];
			}
		}
		System.out.println("Min " + smallest + " And max " + biggest);
	}
}
