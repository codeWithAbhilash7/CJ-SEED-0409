package com.core;

public class TypeCasting {
	public static void main(String[] args) {
		
		// type casting
		int i1 = 845;
		double d1 = i1; // implicit casting
		System.out.println("Implicit casting :: Int to double : " + d1);

		double d2 = 34823.45;
		int i2 = (int) d2; // explicit casting
		System.out.println("Explicit casting :: double to int : " + i2);

		int i3 = 130;
		byte b1 = (byte) i3; // -128 to 127
		System.out.println("Explicit casting :: int to byte : " + b1);
	}
}
