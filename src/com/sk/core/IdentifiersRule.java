package com.sk.core;

public class IdentifiersRule {
	public static void main(String[] args) {
		// Not Valid
		// Identifiers should not start with digits
		// String 123="ram"; //CE:
		// String _="ram"; CE: 9 onwords it use as a keyword

		// Valid
		// we can use this
		String $ = "ram";
		// we can start identifiers with underscore(_)
		String _ram = "ram";
		System.out.println(_ram);
		// we can also start identifiers with doller ($)
		String $ram = "ram";

		// Note:- Java Identifiers are case sensitive of course java language also a
		// case sensitive language.

		String name = "ram";
		String Name = "ram";
		String NAme = "ram";
		// here we differentiate with case

		// All predefined java classes and interfaces names we can use as a identifiers

	}
}
