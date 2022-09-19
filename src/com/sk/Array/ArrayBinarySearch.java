package com.sk.Array;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 6, 9, 4 };
		// must be in Assending order
		int search = 9;
		// 2,4,5,6,8,9
		Arrays.sort(arr);
		int lo = 0;
		int hi = arr.length - 1;

		boolean flag = false;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (search == arr[mid]) {
				System.out.println("Value Found " + search);
				flag = true;
				break;
			} else if (search <= arr[mid])
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		if (flag == false)
			System.out.println("Value Not Present");

	}
}
