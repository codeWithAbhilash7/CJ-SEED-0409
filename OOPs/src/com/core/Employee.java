package com.core;

public class Employee {
	private int id;
	private String name;
	private double salary;

	private static int employeeCount = 0;

	Employee(String name, double salary) {
		// System.out.println("Employee CTor...");
		this.id = ++employeeCount;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + 
				", salary=" + salary + ", Count=" + employeeCount + "]";
	}

	public int getId() {
		return id;
	}
	
	public static int count() {
		
		return employeeCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
