package com.sk.Array;

import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiAddArrayElements {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 6, 9, 4 };

		// List<Integer> collect = Stream.of(arr).collect(Collectors.toList());

		// double sum = collect.stream().mapToDouble(i->i).sum();

		// ooooooOOOOOO we get the point we can crete any object with variable
		var myObj = new Object() {
			int sum = 0;
		};
		IntStream.of(arr).forEach(v -> {
			myObj.sum = myObj.sum + v;
		});
		System.out.println("My Sum is " + myObj.sum);
		// System.out.println(sum);
	}

}
