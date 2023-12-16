package com.exceptions.throwandthrows;

import java.io.IOException;

public class Student {
	private int marks;
	private String name;

	public Student(String name) {
		super();
		this.marks = 0;
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) throws IllegalArgumentException {
		if (marks > 100 || marks < 0)
			throw new IllegalArgumentException("Marks must be between 0 and 100.");
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + marks + ", name=" + name + "]";
	}

}
