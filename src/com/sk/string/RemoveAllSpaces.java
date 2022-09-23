package com.sk.string;

public class RemoveAllSpaces {
	public static void main(String[] args) {
		String input = "Mother In Law";
		String input2 = "Hitler Woman";

		// Remove spaces form given string
		String s1 = input.replaceAll("\\s", "");
		String s2 = input2.replaceAll("\\s", "");
		System.out.println(s1 + ":" + s2);

		// split() remove white space
		String str1 = "";
		String[] split = input.split(" ");
		for (String s : split) {
			str1 += s;
		}
		System.out.println("By other way :" + str1);
		//Loop 
		String str11 = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.toCharArray()[i] != ' ') {
				str11 += input.toCharArray()[i];
			}
		}
		System.out.println("By using loop  :" + str11);

	}
}
