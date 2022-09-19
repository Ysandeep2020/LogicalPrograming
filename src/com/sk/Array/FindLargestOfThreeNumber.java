package com.sk.Array;

public class FindLargestOfThreeNumber {

	public static void main(String[] args) {
		int a = 10, b = 80, c = 30;

		System.out.println((a > b) && (a > c) ? a : (b > c) ? b : c);
	}
}
