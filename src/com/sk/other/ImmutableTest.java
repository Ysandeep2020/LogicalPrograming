package com.sk.other;

final class MyImmutable {
   // set property as private and final 
	private final int id;
	private final String name;

	public MyImmutable(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// only getter method

}

public class ImmutableTest {

}
