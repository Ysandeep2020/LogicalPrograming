package com.sk.other;

final class MyImmutable {

	private int id;
	private String name;

	public MyImmutable(int id, String name) {
		super();
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
