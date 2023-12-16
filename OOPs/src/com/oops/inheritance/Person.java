package com.oops.inheritance;

public class Person {
	private int id;
	private String name;
	private String address;
	private int age;

	private static int nextId = 100;

	public Person(String name) {
		id = ++nextId;
		this.address = "Undefined";
		this.age = -1;
		this.name = name;
	}

	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

	public Person(String name, String address) {
		this(name);
		this.address = address;
	}

	public Person(String name, String address, int age) {
		this(name, address);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Person.nextId = nextId;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}
