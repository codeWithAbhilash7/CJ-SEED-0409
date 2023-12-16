package com.oops.inheritance;

public class Student extends Person {
	private int totalMarks;

	public Student(String name, int totalMarks) {
		super(name);
		this.totalMarks = totalMarks;
	}

	public Student(String name, int age, int totalMarks) {
		super(name, age);
		this.totalMarks = totalMarks;
	}
	
	public Student(String name, String address, int totalMarks) {
		super(name, address);
		this.totalMarks = totalMarks;
	}
	
	public Student(String name, String address, int age, int totalMarks) {
		super(name, address, age);
		this.totalMarks = totalMarks;
	}
	
	@Override
	public String toString() {
		return "Student [totalMarks=" + totalMarks + ", toString()=" + super.toString() + "]";
	}

}
