package com.sk.string;

public class EnterStringAndPrintStars {
	public static void main(String[] args) {
		// Use only single loop
		// input "hello sandeep yadav";
		// output *****
		// *******
		// *****
		String print = "hello peterJoy How is doing";
		printInput(print);
	}

	private static void printInput(String print) {
		for (char c : print.toCharArray()) {
			if (c != ' ') {
				System.out.print("*");
			} else
				System.out.println();
		}

	}
}
