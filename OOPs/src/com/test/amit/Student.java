package com.test.amit;

//3. Write a class named as Student with constructor 
//(default and paradmeterise), getters and setters and 
//toString() method. Write a method which will calculate 
//total marks and average of marks.

public class Student {
	private int id;
	private String name;
	private int maths;
	private int english;
	private int science;
	private int total;
	private double average;

//default
	Student() {
		this.id = 0;
		this.name = "";
		this.maths = 0;
		this.english = 0;
		this.science = 0;
		this.total = 0;
		this.average = 0.0;
	}
//paradmeterise

	Student(int id, String name, int maths, int english, int science) {
		this.id = id;
		this.name = name;
		this.maths = maths;
		this.english = english;
		this.science = science;
		updateMarks();
	}

	public int getEnglish() {
		return this.english;
	}

	public void setEnglish(int marks) {
		this.english = marks;
		updateMarks();
	}

	private void updateMarks() {
		this.total = maths + english + science;
		this.average = total / 3;
	}

	@Override
	public String toString() {
		return "Student [ID=" + id + ", name=" + name + ", maths=" + maths + ", english=" + english + ", science="
				+ science + ", total=" + total + ", average=" + average + "]";
	}

}
