package com.sk.Array;

public class ReverseString {

	public static void main(String[] args) {
		String name = "sandeep";

		// without using predefine methods and increment operator
		String reverse = "";
//		for (int i = 0; i < name.length(); i++) {
//			reverse = reverse + name.charAt(name.length() - 1 - i);
//		}
//       

		for (int i = name.length() - 1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		// decrement operator
		System.out.println(reverse);
	}
}
