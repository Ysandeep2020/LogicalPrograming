package com.sk.Array;

public class PlaindromeString {
	public static void main(String[] args) {
		String name = "saippuakivikauppias";

		// original String equal to reverse String
		String reverse = "";
		for (int i = 0; i < name.length(); i++) {
			reverse = reverse + name.charAt(name.length() - 1 - i);
		}
		
	    if(name.equals(reverse))System.out.println("Yes");
	    else System.out.println("No");
		
	}
}
