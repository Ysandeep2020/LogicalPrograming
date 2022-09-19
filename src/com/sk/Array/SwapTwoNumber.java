package com.sk.Array;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 20, b = 30;
		System.out.println(a + " Before " + b);

		// using thrid variable
//		int temp = a;
//		a = b;
//		b = temp;

		// without using third variable

		a = a + b; // 20+30=50
		b = a - b; // 50-30=20
		a = a - b;

		System.out.println(a + " Now " + b);

	}
}
