package com.sk.string;

/**
 * Input: N = 4 arr[] = {geeksforgeeks, geeks, geek, geezer} Output: gee
 * Explanation: "gee" is the longest common prefix in all the given strings.
 * 
 * @author Sandeep yadav
 *
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
		String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
		System.out.println(longestCommonPrefix(4, arr));
	}

	private static String longestCommonPrefix(int n, String[] arr) {

		// how to get longest prefix in given array
		// here we first get min string
		int min = Integer.MAX_VALUE;
		int pos = 0;
		for (int j = 0; j < arr.length; j++) {
			if (min > arr[j].length()) {
				// can we get position
				min = arr[j].length();
				pos = j;
			}
		}
		// here we get minimum =3;
		// and that position also
		String newStr = arr[pos];
		char[] array = newStr.toCharArray();
		String res = "";
		// now we match to all
		for (int i = 0; i < array.length; i++) {
			boolean present = true;
			for (int j = 0; j < n; j++) {
				char[] ch = arr[j].toCharArray();
				// g geeks geezz : i=0
				// e geeks geezz : i=1
				// e geeks geezz : i=2
				if (array[i] != ch[i]) {
					// k geeks geezz :i=3
					present = false;
					break;
				}

			}
			if (present)
				res += array[i];
		}

		return res = res == "" ? "-1" : res;

	}
}
