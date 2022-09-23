package com.sk.other;

public class StringTest2 {
	public static void main(String[] args) {
		String input = "i.like.this.program.very.much";
		String input22 = "i@like@this@program@verymuch";
		String[] split = input22.split("@");
		// output "i.abc.this.abc.very.abc"
		String[] arr = input.split("\\.");
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				if (i % 2 != 0)
					output += ".abc";
				else
					output += (".") + arr[i];
			} else
				output += arr[i];
		}

		// now add . to each element
//			if (i < 0)
//				output = "." + output;
//			else
//				output += output;
		System.out.println("Input :" + input);
		System.out.println("Output :" + output);
	}

}
