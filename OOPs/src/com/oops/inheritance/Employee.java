package com.oops.inheritance;

public class Employee extends Person {
	private int employeeId;
	private double salary;

	private static int empIdGenerator;
	
	static {
		empIdGenerator = 200;
		System.out.println("#### Executing static block ####");
	}

	public Employee(String name, String address, int age, double salary) {
		super(name, address, age);
		this.employeeId = ++empIdGenerator;
		this.salary = salary;
		System.out.println("#### Executing ctor ####");
	}

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.employeeId = ++empIdGenerator;
		this.salary = salary;
	}

	public Employee(String name, String address, double salary) {
		super(name, address);
		this.employeeId = ++empIdGenerator;
		this.salary = salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tEmployee [employeeId=" + employeeId + ", salary=" + salary + "]";
	}

	public Employee(String name, double salary) {
		super(name);
		this.employeeId = ++empIdGenerator;
		this.salary = salary;
	}

}
