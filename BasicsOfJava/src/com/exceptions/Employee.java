package com.exceptions;

public class Employee {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException {
		if (age < 18 || age > 60)
			throw new IllegalAgeException("Age must be between 18 and 60");
		this.age = age;
	}

	public Employee(String name, int age) throws IllegalAgeException {
		super();
		
		if (age < 18 || age > 60)
			throw new IllegalAgeException("Age must be between 18 and 60");
		
		this.name = name;
		this.age = -1;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}
