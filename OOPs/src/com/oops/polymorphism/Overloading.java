package com.oops.polymorphism;

public class Overloading {

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static int addition(double number1, double number2) {
		return (int) (number1 + number2);
	}

	/**
	 * This method returns area of square
	 * 
	 * @param side : side of a square
	 * @return area of given square
	 */
	public static double area(double side) {
		return side * side;
	}

	/**
	 * This method returns area of triangle
	 * 
	 * @param base   of the triangle
	 * @param height of the triangle
	 * @return area of given triangle
	 */
	public static double area(double base, double height) {
		return base * height;
	}

	/**
	 * 
	 * @param base
	 * @param height
	 * @param placeHolder this is just a placeholder. This arg is ignored. So you
	 *                    can either pass true or false
	 * @return
	 */
	public static double area(double base, double height, boolean placeHolder) {
		return base * height;
	}

	public static void main(String[] args) {

		System.out.println(addition(10, 20));
		// System.out.println(addition((int)10.5f, (int)20.5f));
		System.out.println(addition(10.5, 20.5));
	}

}
