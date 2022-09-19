package com.sk.Array;

public class ArrayInsertionSort {
	public static int[] insertinSort(int[] arr) {

		// 5 4 10 1 6 2

		// two unsorted sublist are there
		// one is unsorted sublist
		// one is sorted sublist

		// loop start from 2nd post because we assume 1st pos is sorted already
		for (int i = 1; i < arr.length; i++) {
			// that value stored in temp
			int temp = arr[i];
			// j because we take back postion
			int j = i - 1;

//			while (j >= 0 && arr[j] > temp) {
//				arr[j + 1] = arr[j];
//				j--;
//			}
			for (; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			// set temp
			arr[j + 1] = temp;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 10, 6, 2 };
		int[] arr1 = { 2, 5, 8, 6, 9, 4 };
		// this loop for passses
		insertinSort(arr);
		for (int a : arr) {
			System.out.print(a + ",");
		}

	}
}
