package com.sk.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayRemoveDuplicate {

	public static int[] removeDuplicateSorted(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[count++] = arr[i];
			}
		}
		arr[count] = arr[arr.length - 1];
		for (int a : arr) {
			if (count >= 0)
				count--;
			else
				break;
			System.out.print(a + ",");
		}
		return arr;
	}

	public static void main(String[] args) {

		Integer[] arr = { 2, 5, 5, 8, 8, 6, 9, 4, 4 };
		// this loop for passses
//		removeDuplicateSorted(arr);

		// HashSet
		Set<Integer> set = new HashSet<Integer>();
		for (int a : arr) {
			set.add(a);

		}

		System.out.println(set);

		// java 8
		List<Integer> collect = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
