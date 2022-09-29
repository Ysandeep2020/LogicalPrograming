package com.sk.core;

/**
 * return this instead of void
 * 
 * @author Sandeep yadav
 *
 */
class Team {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public Team setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Team setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}

}

public class CustomMethodChaining {
	public static void main(String[] args) {
		Team team = new Team();
		System.out.println(team.setId(1).setName("Peter").toString());

	}
}
