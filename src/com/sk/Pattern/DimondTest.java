package com.sk.Pattern;

public class DimondTest {
	public static void main(String[] args) {

		// Diamond test

		// one outer loop for iteration
		// two inner loop for 1st for print space and 2nd for print star
		int row = 5;

		for (int i = 1; i <= row; i++) {

			for (int j = row - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
		row--;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= row; j++) {
				System.out.print("*   ");
			}

			System.out.println();
		}
	}
}
