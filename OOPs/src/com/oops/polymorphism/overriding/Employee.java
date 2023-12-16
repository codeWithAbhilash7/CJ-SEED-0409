package com.oops.polymorphism.overriding;

public class Employee extends Person {

	private final int ID;
	private double salary;
	private static int nextId;

	static {
		nextId = 2222;
	}

	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
		this.ID = nextId++;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + ID + ", salary=" + salary + ", name=" + getName() + "]";
	}

	public void calculateSalary(int numberOfSales, double incentive) {
		System.out.println("Nothing to calculate. Using default salary");
	}

	public void calculateSalary() {
		System.out.println("Nothing to calculate. Using default salary");
	}

	public double getSalary() {
		return salary;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
	}

}
