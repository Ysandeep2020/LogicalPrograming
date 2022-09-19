package com.sk.string;

import java.text.DecimalFormat;

public class CharacterPercentage {

	public static void charPercentage(String input) {
		int total = input.length();
		int lower = 0;
		int upper = 0;
		int digit = 0;
		int special = 0;

		for (char ch : input.toCharArray()) {
			if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= '0' && ch <= '9')
				digit++;
			else
				special++;
		}
		DecimalFormat format = new DecimalFormat("##.##");
		double lowerPer = lower * 100 / total;
		double upperPer = upper * 100 / total;
		double digitPer = digit * 100 / total;
		double specialPer = special * 100 / total;
		System.out.println("In '" + input + "' :");
		// System.out.println("In '" + input + "' : ");
		System.out.println("LowerCase Letter are " + format.format(upperPer) + "%");
		System.out.println("UpperCase Letter are " + format.format(lowerPer) + "%");
		System.out.println("Digits Letter are " + format.format(digitPer) + "%");
		System.out.println("Special Letter are " + format.format(specialPer) + "%");
	}

	public static void charPercentageInBuildMethod(String input) {
		int total = input.length();
		int lower = 0;
		int upper = 0;
		int digit = 0;
		int special = 0;

		for (char ch : input.toCharArray()) {
			if (Character.isLowerCase(ch))
				lower++;
			else if (Character.isUpperCase(ch))
				upper++;
			else if (Character.isDigit(ch))
				digit++;
			else
				special++;
		}
		DecimalFormat format = new DecimalFormat("##");
		double lowerPer = lower * 100 / total;
		double upperPer = upper * 100 / total;
		double digitPer = digit * 100 / total;
		double specialPer = special * 100 / total;
		System.out.println("In '" + input + "' :");
		// System.out.println("In '" + input + "' : ");
		System.out.println("LowerCase Letter are " + format.format(upperPer) + "%");
		System.out.println("UpperCase Letter are " + format.format(lowerPer) + "%");
		System.out.println("Digits Letter are " + format.format(digitPer) + "%");
		System.out.println("Special Letter are " + format.format(specialPer) + "%");
	}

	public static void main(String[] args) {
		String input = "India is my country 100%";
		charPercentage(input);
		System.out.println("-=====================");
		charPercentageInBuildMethod(input);
	}
}
