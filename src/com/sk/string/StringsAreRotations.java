package com.sk.string;

public class StringsAreRotations {

	public static void main(String[] args) {
		String orignal = "IndiaEngland";
		String rotation = "EnglandIndia";

		// int indexOf = roation.indexOf("The");
		// System.out.println(indexOf);
		// first we check lenght of both string
		if (orignal.length() != rotation.length())
			System.out.println("True");
		else
			System.out.println("False");

		String concat = orignal + orignal;

		if (concat.indexOf(rotation) != -1)
			System.out.println("True");
		else
			System.out.println("False");

	}
}
