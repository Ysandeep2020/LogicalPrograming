package com.sk.string;

public class SwappingTwoStringWithoutTemp {

	public static void main(String[] args) {
		// Swapping two String without using temp or third variable
		String input1 = "Hello";
		String input2 = "Rama";

//		String stringTemp = input1;
//		input1 = input2;
//		input2 = stringTemp;
//		System.out.println("Input1 :" + input1 + "  Or  Input2  :" + input2);

		// swap without using temp variable
		input1 = input1 + input2;
		// input1 =HelloRama
		// first we get input2
		input2 = input1.substring(0, input1.length() - input2.length());
		input1 = input1.substring(input2.length());

		System.out.println("Without using Third Variable 1:" + input1 + " 2:" + input2);

	}
}
