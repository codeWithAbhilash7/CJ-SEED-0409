package com.oops.polymorphism.overriding;

public class Person {
	private int aadhar;
	private String name;

	private static int nextId;

	static {
		nextId = 1111;
	}

	public Person(String name) {
		super();
		this.name = name;
		this.aadhar = nextId++;
	}

	@Override
	public String toString() {
		return "Person [aadhar=" + aadhar + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
	

}
