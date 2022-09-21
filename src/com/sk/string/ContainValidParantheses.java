package com.sk.string;

public class ContainValidParantheses {
	public static void main(String[] args) {
		String input = "{([ramu])}";

//		if (input.startsWith("{") && input.endsWith("}")) {
//			System.out.println("Valid");
//		}

		char[] charArray = input.toCharArray();
		int inCB = 0, inB = 0, inPa = 0;
		int endCB = 0, endB = 0, endPa = 0;
		for (char ch : charArray) {
			// give condition for parentheses {} () []
			// must be in order
			// for start paranthis
			if (ch == '{')
				inCB++;
			if (ch == '(')
				inPa++;
			if (ch == '[')
				inB++;
			// end Parantheses
			if (ch == '}' && inCB != 0)
				inCB--;
			if (ch == ')' && inPa != 0)
				inPa--;
			if (ch == ']' && inB != 0)
				inB--;
		}
		if (inCB != 0 || inPa != 0 || inB != 0) {
			System.out.println("Given :" + input + "  is not valid paranthes");
		} else
			System.out.println("Given :" + input + "  is  valid paranthes");

	}
}
