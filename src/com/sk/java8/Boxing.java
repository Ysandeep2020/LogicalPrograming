package com.sk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Boxing {
	public static void main(String[] args) {

		int arr[] = { 1, 5, 4, 8, 8, 5, 5, 7 };
		List<int[]> asList = Arrays.asList(arr);
		// we use boxing mechanism (to convert primitive to their wrapper equivalent
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		// or
		List<Integer> collect2 = IntStream.of(arr).boxed().collect(Collectors.toList());

		Integer arr1[] = { 1, 5, 4, 8, 8, 5, 5, 7 };
		List<Integer> asList1 = Arrays.asList(arr1);

	}
}
