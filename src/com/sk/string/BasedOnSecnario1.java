package com.sk.string;
/**
 *  	 input ===== computer
 *  
		 if name contain one middle char then pick that and separate it .
		 if name contain two middle char then
		 always pick left side character.
		 
	    p  -  comuter
	    pu  - comter
	    pum - coter
	    pumt -  coer
	    pumto - cer
	    pumtoe - cr
	    pumtoec - r

		 output ===== pumtoecr
		 
		 
 * @author Sandeep yadav
 *
 */
public class BasedOnSecnario1 {
	public static String solveSecnario(String name) {
	

		String output = "";
		// first divide by 2 so get that position character
		while (name != "") {
			// first divide by 2 so get that position character
			// We pick that char and add into new variable.
			int intVal = name.length() / 2;
			// Scenario if length of name is even then take left character
			// if length of name is even then val will reduce by 1
			// comter
			// left value m
			intVal = name.length() % 2 == 0 ? intVal - 1 : intVal;
			output += name.charAt(intVal);
			// output pumtoecr
			// Now we write logic for reduce string
			name = name.substring(0, intVal) + name.subSequence(intVal + 1, name.length());

		}

		return output;

	}

	public static void main(String[] args) {
//
//		// R & D on substring() method
//		String name = "PeterCharlyKuldeepMerryRonyPicaso";
//		String getSecondName = name.substring(name.lastIndexOf("P"));
//
//		String substring = name.substring(0, 5);
//		String substring2 = name.substring(5, 11);
//		String substring3 = name.substring(11, 18);
//		String substring4 = name.substring(18, 23);
//		String substring5 = name.substring(23, 27);
//		System.out.println(substring + " " + substring2 + "   " + substring3 + " " + substring4 + " " + substring5);
//
//		// same thing we can achive by loop
		// i thing loop not working on this logic

		String name = "computer";
		String solveSecnario = solveSecnario(name);
		if (solveSecnario.equals("pumtoecr"))
			System.out.println("Logic Click");
		else
			System.out.println("Go Throw your code.");
		// that char remove from original string

	}

}
