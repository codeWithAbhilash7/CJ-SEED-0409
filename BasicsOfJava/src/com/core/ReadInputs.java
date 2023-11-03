package com.core;

import java.util.Scanner;

public class ReadInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object of scanner class
		Scanner sc = new Scanner(System.in);

		// integral data types
		// accept a bye
		System.out.print("Enter a byte value : ");
		byte byteValue = sc.nextByte();
		System.out.println("Byte value is : " + byteValue);

		// accept a short
		System.out.print("\nEnter a short value : ");
		short shortValue = sc.nextShort();
		System.out.println("Short value is : " + shortValue);

		// accept an int
		System.out.print("\nEnter an int value : ");
		int intValue = sc.nextInt();
		System.out.println("Int value is : " + intValue);

		// accept long
		System.out.print("\nEnter a long value : ");
		long longValue = sc.nextLong();
		System.out.println("Long value is : " + longValue);

		// decimal data
		// float
		System.out.print("\nEnter a float value : ");
		float floatValue = sc.nextFloat();
		System.out.println("Float value is : " + floatValue);

		// double
		System.out.print("\nEnter a double value : ");
		double doubleValue = sc.nextDouble();
		System.out.println("Double value is : " + doubleValue);

		// character
		System.out.print("\nType any character : ");
		char charValue = sc.next().charAt(0);
		System.out.println("Enter char is : " + charValue);

		// boolean
		System.out.print("\nType a boolean value : ");
		boolean boolValue = sc.nextBoolean();
		System.out.println("Boolean value is : " + boolValue);

		// String
		System.out.print("Enter your first name : ");
		String firstName = sc.next();
		System.out.println("Hello, " + firstName);

		System.out.print("Enter your full name : ");
		String fullName = sc.nextLine();
		System.out.println("Welcome, " + fullName);

		sc.close();
	}

}
