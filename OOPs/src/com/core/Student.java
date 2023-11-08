package com.core;

public class Student {
	int rollNumber; // id
	String name; // name
	float marks; // marks in any subject

	Student() {
		System.out.println("Line 9 :: Student default Ctor...");
		this.rollNumber = -1;
		this.name = "";
		this.marks = 0;
		System.out.println("Line 13 :: Student default Ctor...");
	}

	Student(int id, String name, float marks) {
		System.out.println("Line 17 :: Student Parameterized Ctor...");
		this.rollNumber = id;
		this.name = name;
		this.marks = marks;
		System.out.println("Line 21 :: Student Parameterized Ctor...");
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}