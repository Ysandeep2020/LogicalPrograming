package com.sk.Array;

public class ArrayMaxAndMin {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 6, 9, 4 };

		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			if (max < arr[i])
				max = arr[i];
		}

		System.out.println(min + " min  Max " + max);

	}
}
