package com.sk.Array;

public class CountSumOfNumber {
	public static void main(String[] args) {

		int number = 678;
		int sum = 0;

		while (number != 0) {
			int r = number % 10;
			sum = sum + r;
			number = number / 10;
		}
		System.out.printf(" Sum  is %d ", sum);
	}
}
