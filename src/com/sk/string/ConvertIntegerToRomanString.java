package com.sk.string;

import java.util.HashMap;

public class ConvertIntegerToRomanString {
	public static void main(String[] args) {
		int num = 49;
		int org = num;
		// for integer to roman String
		int[] values = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLetters = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuffer roman = new StringBuffer();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num = num - values[i];
				roman.append(romanLetters[i]);
			}
		}
		System.out.println(org + ":" + roman);
	}
}
