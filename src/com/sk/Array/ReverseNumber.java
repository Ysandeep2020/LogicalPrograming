package com.sk.Array;

public class ReverseNumber {

	public static void main(String[] args) {

		// reverse a number
		// 1 Using algorithims

		int num = 34567;
		int rev = 0;

//		while (num > 0) {
//			// get last digit
//			int r = num % 10;
//			// set that digit into rev variable with multiply 10
//			rev = rev * 10 + r;
//			// next new number
//			num = num / 10;
//		}

		// 2nd way StringBuffer obj And StringBuilder

		StringBuffer stringBuffer = new StringBuffer(String.valueOf(num));
		StringBuffer reverse = stringBuffer.reverse();

		System.out.println(reverse);

	}
}
