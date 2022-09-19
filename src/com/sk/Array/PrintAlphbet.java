package com.sk.Array;

public class PrintAlphbet {
	public static void main(String[] args) {

		System.out.println("---------------");
		int count = 0;
		for (int i = 65; i <= 90; i++) {
			System.out.println((count++) + " pos " + (char) i);
		}
	}
}
