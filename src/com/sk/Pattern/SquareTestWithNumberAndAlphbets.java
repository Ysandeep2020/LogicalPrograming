package com.sk.Pattern;

public class SquareTestWithNumberAndAlphbets {

	public static void main(String[] args) {

		// Square Program with increment
		// print alphabet
		char ch = 'A';
		int count=0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
	   System.out.print((count++)+" ");
				// System.out.print((char) (((int) ch + i - 1)) + " ");

//				if(i==2 && j==3)System.out.print("00 ");
//				else System.out.print(i + "" + j + " ");

				// System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}

		// Square Program with decrement operator

//		for (int i = 4; i >= 1; i--) {
//			for (int j = 4; j >= 1; j--) {
//				if (i == j || i + j == 5)
//					System.out.print("0 ");
//				else
//					System.out.print(i + j + " ");
//			}
//			System.out.println();
//		}

	}
}
