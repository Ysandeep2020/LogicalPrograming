package com.sk.core.enumm;

public class EnumTest {
	// first enum class
	enum Beer {
		KF, RC, KO, FO
	}

	// For switch case
	enum Day {
		SUN, MON, TUE, WED, THS, FRI, SAT;
	}

	public static String drink(Beer beer) {
		return "Today ,i drink " + String.valueOf(beer);
	}

	public static void switchCase(Day day) {
		switch (day) {
		case MON:
			System.out.println("Monday is bed");
			break;
		case FRI:
			System.out.println("Friday is better.");
			break;
		case SAT:
		case SUN:
			System.out.println("Weekends are best");
			break;
		default:
			System.out.println("Mid weeks are so  so.");
			break;
		}
	}

	public static void main(String[] args) {

		String name = Beer.FO.name();
		// 1 st way
		System.out.println(drink(Beer.KF));
		// 2nd way
		String str = "KO";
		System.out.println(drink(Beer.valueOf(str)));
	}
}
