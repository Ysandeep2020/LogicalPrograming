package com.sk.other;

import java.util.Arrays;

public class StringTest1 {

	public static void main(String[] args) {

		String input = "i.like.this.program.very.much";
		// Output: much.very.program.this.like.i
		// split
		String[] split = input.split("\\.");
		// reverse all split
		String output = "";
		for (int i = split.length - 1; i >= 0; i--) {
			if (i > 0)
				output += split[i] + ".";
			else
				output += split[i];

		}

		System.out.println(output);

	}

}
