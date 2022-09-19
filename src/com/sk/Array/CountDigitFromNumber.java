package com.sk.Array;

public class CountDigitFromNumber {
	public static void main(String[] args) {

		int number = 345656455;
		int orig = number;
		int count = 0;

		while (number != 0) {
			number = number / 10;
			count++;
		}

		System.out.println(count + " digit are there in " + orig);
		System.out.printf(" %d Didit are There in %n %d ",count,orig);
	}
}
