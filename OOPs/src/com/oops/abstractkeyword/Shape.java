package com.oops.abstractkeyword;

public abstract class Shape {
	private double area;

	abstract public double calculateArea();

	final public void finalMethod() {
		System.out.println("This is a final method in Shape class");
	}

	public Shape() {
		this.area = 0.0;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
