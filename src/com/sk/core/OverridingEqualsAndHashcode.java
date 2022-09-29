package com.sk.core;

import java.util.Objects;

class User {

	private int id;
	private String name;
	private String email;

	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return this != null ? Objects.hash(id, name, email) : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User user = (User) obj;
		if (Objects.deepEquals(name, user.name) && this.id == user.id && Objects.equals(this.email, user.email))
			return true;
		return true;
	}
}

public class OverridingEqualsAndHashcode {

	public static void main(String[] args) {
		User user1 = new User(1, "sk1", "sk1@gmail.com");
		User user2 = new User(2, "sk1", "sk1@gmail.com");
		System.out.println(user1.equals(user2));
	}
}
