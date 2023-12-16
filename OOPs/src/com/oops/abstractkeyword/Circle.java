package com.oops.abstractkeyword;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 2 * Math.PI * Math.pow(radius, 2);
	}

}
