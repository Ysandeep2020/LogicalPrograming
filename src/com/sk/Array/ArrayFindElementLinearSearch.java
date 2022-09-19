package com.sk.Array;

public class ArrayFindElementLinearSearch {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 6, 9, 4 };

		int searchElement = 2;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (searchElement == arr[i]) {
				System.out.println("Element founded " + arr[i]);
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("Element Not found");
	}
	
	
}
