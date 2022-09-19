package com.sk.Array;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int third = 0;
		// Fibonacci Series=Sum of Preceding Numbers 0,1,1,2,3,5,8,13,21...
		System.out.print(first + "," + second);
		for (int i = 1; i < 10; i++) {
			third = first + second;
			System.out.print("," + third);
			first = second;
			second = third;

		}

	}
}
