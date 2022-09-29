package com.sk.string;

public class Shuffle {

	public static void main(String[] args) {

		String input = "hello";
		deepShuffle(input);

	}

	private static void deepShuffle(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.println(shuffle(input));
		}
	}

	private static String shuffle(String input) {
		char[] array = input.toCharArray();

		for (int i = 0; i < array.length; i++) {
			// pick random index number
			int randomIndex = (int) (Math.random() * input.length());
			// swap with i postion to randomIndex
			char temp = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = temp;
		}
		return new String(array);
	}
}
