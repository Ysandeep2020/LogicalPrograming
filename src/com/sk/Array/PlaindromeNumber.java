package com.sk.Array;

public class PlaindromeNumber {
	public static void main(String[] args) {
		int number = 1367631;
		int origNumber = number;
		// origNumber==reverNumber

		int reverseNumber = 0;

		while (number != 0) {
			int r = number % 10;
			reverseNumber = reverseNumber * 10 + r;
			number = number / 10;
		}
		if (origNumber == reverseNumber)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
