package com.sk.Array;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {
		// selectino sort
		// first we select min value

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// we find min pos then swap with i postion
			// min and i are not same then only swap
			if (i != min) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 6, 9, 4 };
		// this loop for passses
		// bubbleSort(arr);
		selectionSort(arr);
		for (int a : arr) {
			System.out.print(a + ",");
		}

	}
}
