package com.oops.polymorphism.overriding;

public class Developer extends Employee {

	public Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public String toString() {
		return "Developer [EmpId=" + super.getID() + ", Salary=" + getSalary() + ", Name=" + getName() + "]";
	}

}
