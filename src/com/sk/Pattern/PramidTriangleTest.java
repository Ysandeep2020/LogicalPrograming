package com.sk.Pattern;

public class PramidTriangleTest {

	   public static void main(String[] args) {
		
		   // Pramid Triangle R & D 
		// one outer loop for iteration
			// two inner loop for 1st for print space and 2nd for print star
			int row = 10;

			for (int i = 1; i <= row; i++) {

				for (int j = row - 1; j >= i; j--) {
					System.out.print("  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*   ");
				}
				System.out.println();
			}
	}
}
