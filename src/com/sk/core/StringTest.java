package com.sk.core;

public class StringTest {
	public static void main(String[] args) {

//		String s1 = new String("peter");
//		// here we get two object one is as part of Heap and other in SCP area.
//		String s2 = "peter";
//		System.out.println(s1 == s2); // false b/z both are not pointing to same object
//		System.out.println(s1.equals(s2)); // true b/z both content are same

//		StringBuffer s1 = new StringBuffer("peter");
//		// here we get two object one is as part of Heap and other in SCP area.
//		StringBuffer s2 = new StringBuffer("peter");
//		System.out.println(s1 == s2); // false b/z both are not pointing to same object
//		System.out.println(s1.equals(s2)); // false b/z both are not pointing to same object
//		

//		String s1 = new String("bhaskar");
//		String s2 = new String("bhaskar");
//		String s3 = "bhaskar";
//		String s4 = "bhaskar";

//		String s = new String("bhaskar");
//		s.concat("software");
//		s = s.concat("solutions");
//		s = "bhaskarsoft";
//		System.out.println(s);

//		System.out.println(s1 == s3); // false
//		System.out.println(s4 == s3); // true
		
		
		String s1=new String("spring");
		s1.concat("fall");
		s1=s1+"winter";
		String s2=s1.concat("summer");
		System.out.println(s1);
		System.out.println(s2);

	}
}
