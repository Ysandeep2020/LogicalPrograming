package com.sk.Array;

public class ArrayBubbleSort {

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// this loop for iteration of each value of Pass
			// Based on the pass last item will be sorted
			// we dont want to iterate at the end
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 6, 9, 4 };
		// this loop for passses
        bubbleSort(arr);
		for (int a : arr) {
			System.out.print(a + ",");
		}

	}

}
