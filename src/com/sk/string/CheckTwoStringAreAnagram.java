package com.sk.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckTwoStringAreAnagram {

	public static void main(String[] args) {
		String input1 = "pat";
		String input2 = "TAP";

		System.out.println(CheckAnagramJava8(input1, input2));
		System.out.println(CheckAnagram(input1, input2));
	}

	private static boolean CheckAnagramJava8(String input1, String input2) {
		if (input1.length() != input2.length())
			return false;
		return input1.toLowerCase().chars().sorted().mapToObj(obj -> obj).collect(Collectors.toList())
				.containsAll(input2.toLowerCase().chars().mapToObj(obj -> obj).toList());
	}

	private static boolean CheckAnagram(String input1, String input2) {
		boolean flag = false;
		// check the lenghth of given strings
		if (input1.length() != input2.length())
			return flag = false;

		// find it contain same character or not
		// solution 1 sort both of strings
         Arrays.sort(input1.toLowerCase().toCharArray());
		char[] charArray = input1.toLowerCase().toCharArray();
		Arrays.sort(charArray);

		char[] charArray1 = input2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);

		// Now we check both are equal or not And also check case
		if (String.valueOf(charArray).equals(String.valueOf(charArray1)))
			return flag = true;
		return flag;

	}
}
