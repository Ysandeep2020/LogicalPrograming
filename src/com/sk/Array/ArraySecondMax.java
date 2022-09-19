package com.sk.Array;

import java.util.Arrays;

public class ArraySecondMax {

	public static int withSingleIteration(int[] arr, int total) {

		int max = 0, sMax = 0;
		if (total > 1) {

			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					sMax = max;
					max = arr[i];
				} else if (sMax < arr[i] && max != arr[i])
					sMax = arr[i];
			}
		}
		return sMax;
	}

	public static int secondHigest(int[] arr, int total) {
		Arrays.sort(arr);
		// here we check last element are equal to this
		int secondMax = 0;
		int last = arr[arr.length - 1];
		for (int i = total - 2; i >= 0; i--) {
			if (last != arr[i]) {
				secondMax = arr[i];
				break;
			}
		}
		return secondMax != 0 ? secondMax : -1;
	}

	public static void main(String[] args) {
		// int[] arr = { 2, 5, 8, 6, 6, 9, 4, 4, 9 };

//		 int arr[] = { 12, 35, 1, 10, 34, 1 };
//		largest element is 34
	//	int arr[] = { 10, 10, 5, 10, 10 };
//		largest element is 5
		int arr[] = { 10, 10, 10 };
//     No second Largest elemet 

		// int arr[]= {10};
		// array must contain two element
//		System.out.println();
//		if (secondHigest(arr, arr.length) != -1)
//			System.out.println(secondHigest(arr, arr.length));
//		else
//			System.out.println("No second largest element");
		
		System.out.println(withSingleIteration(arr, arr.length));
		
	}
}
