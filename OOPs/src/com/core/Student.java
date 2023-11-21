package com.core;

public class Student {
	private int rollNo;
	private String name;
	private String address;
	private double maths;
	private double physics;
	private double chemistry;

	private double totalMarks;
	private double average;

	private static int rollNumberGenerator = 100;

	public Student(String name) {
		super();
		this.name = name;
		this.address = "Pune";
		this.rollNo = ++rollNumberGenerator;
	}
	
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.rollNo = ++rollNumberGenerator;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", maths=" + maths + ", physics=" + physics
				+ ", chemistry=" + chemistry + ", totalMarks=" + totalMarks + ", average=" + average + "]";
	}

	public double getMaths() {
		return maths;
	}

	private void updateMarks() {
		totalMarks = physics + chemistry + maths;
		average =  totalMarks / 3;
	}

	public void setMaths(double maths) {
		this.maths = maths;
		updateMarks();

	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
		updateMarks();
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
		updateMarks();
	}

	public double getAverage() {
		return average;
	}
	
	

}
