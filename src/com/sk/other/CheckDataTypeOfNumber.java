package com.sk.other;

public class CheckDataTypeOfNumber {

	public static void main(String[] args) {
		// double pow = Math.pow(2, 4);
		// System.out.println(pow); output :16
		long number = 75;
		findDataTypeOfNumber(number);
	}

	private static void findDataTypeOfNumber(long number) {
		// Here we check data type of given numbers like as a byte,short,int,long,double

		// logic for byte data type
		// -128 to +127 -2 power 7 to 2 power 7 -1
		if (number >= Math.pow(-2, 7) && number <= Math.pow(2, 7) - 1)
			System.out.println("Given Number " + number + " is Byte Data type");
		// logic for short data type
		//
		else if (number >= Math.pow(-2, 15) && number <= Math.pow(2, 15) - 1)
			System.out.println("Given Number " + number + " is Short Data type");

		else if (number >= Math.pow(-2, 31) && number <= Math.pow(2, 31) - 1)
			System.out.println("Given Number " + number + " is Integer Data type");

		else if (number >= Math.pow(-2, 63) && number <= Math.pow(2, 63) - 1)
			System.out.println("Given Number " + number + " is Long Data type");
		else
			System.out.println("Given Number " + number + " is different Type of Data///");

	}
}
