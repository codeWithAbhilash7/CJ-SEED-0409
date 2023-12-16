package com.oops.polymorphism.overriding;

public class SalesPerson extends Employee {

	private int noOfSales;
	private double incentivePerSale;

	public SalesPerson(String name, double salary, double incentivePerSale) {
		super(name, salary);
		this.noOfSales = 0;
//		this.incentivePerSale = incentivePerSale;
		this.incentivePerSale = 0;
	}

	@Override
	public String toString() {
		return "SalesPerson [noOfSales=" + noOfSales + ", incentivePerSale=" + incentivePerSale + ", EmpId="
				+ super.getID() + ", Salary=" + getSalary() + ", Name=" + getName() + "]";
	}

	@Override
	public void calculateSalary() {
		super.calculateSalary(noOfSales, incentivePerSale);
		double incentive = this.noOfSales * this.incentivePerSale;
		double finalSalary = incentive + super.getSalary();
		super.setSalary(finalSalary);

		// super.setSalary(this.noOfSales * this.incentivePerSale + super.getSalary());
	}

	public void setIncentivePerSale(double incentivePerSale) {
		this.incentivePerSale = incentivePerSale;
	}

	public void setNoOfSales(int noOfSales) {
		this.noOfSales = noOfSales;

		if (this.noOfSales >= 5) {
			this.setIncentivePerSale(7500);
		} else if (this.noOfSales < 5) {
			this.setIncentivePerSale(5000);
		}
	}
}
