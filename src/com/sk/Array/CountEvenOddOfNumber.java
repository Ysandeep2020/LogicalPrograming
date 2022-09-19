package com.sk.Array;

public class CountEvenOddOfNumber {
	public static void main(String[] args) {
		int number = 345656455;
		// find even and odd percentage
		int even = 0;
		int odd = 0;
		int total = 0;
		float evenPer, oddPer = 0;
		while (number != 0) {
			int r = number % 10;
			if (r % 2 == 0)
				even++;
			else
				odd++;
			number = number / 10;

		}
		total = even + odd;
		evenPer = (even * 100) / total;
		oddPer = (odd * 100) / total;
		System.out.printf("Even are %2.2f And Odd are %2.2f %n", evenPer, oddPer);
		System.out.println(evenPer+oddPer);
	}
}
