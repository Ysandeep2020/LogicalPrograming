package com.sk.Array;

import java.util.Arrays;
import java.util.Iterator;

public class Array2ArrayAreEquelOrNot {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 8 };
		int[] arr2 = { 2, 1, 8 };

		// How To check the equality of two array
		int length = arr1.length;
		int count = 0;
		if (arr1.length == arr2.length && arr1 != null && arr2 != null) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for (int i = 0; i < length; i++) {
				if (arr1[i] == arr2[i])
					count++;
			}
		}

		if (length == count)
			System.out.println("Both are equals");
		else
			System.out.println("Not equals");
		// Arrays class

		// boolean equals = Arrays.equals(arr1, arr2);
		// System.out.println(equals);
	}
}
