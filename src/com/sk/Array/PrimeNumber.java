package com.sk.Array;

public class PrimeNumber {

	public static void main(String[] args) {
		// number>1 && number which have 2 factors 1 or itself.
		int number = 19;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
