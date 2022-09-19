package com.sk.Array;

public class ArraySumOfElement {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 2, 5, 8, 6, 9, 4 };

		for (int a : arr)
			sum = sum + a;
		System.out.println(sum);
	}
}
