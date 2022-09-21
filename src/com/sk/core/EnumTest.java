package com.sk.core;

public class EnumTest {

	enum Beer {
		KF, RC, KO, FO
	}

	public static String drink(Beer beer) {
		return "Today ,i drink " + String.valueOf(beer);
	}

	public static void main(String[] args) {
		System.out.println(drink(Beer.KF));
	}
}
