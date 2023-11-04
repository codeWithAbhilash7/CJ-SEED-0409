package com.core;

public class Methods {
	public static void printTable(int number) {
		if (number == 0)
			return;
		for (int i = 1; i <= 10; i++) {
			System.out.print((number * i) + " ");

		}
		System.out.println();
	}

	public static void testFunction(int anotherNumber) {
		System.out.println(anotherNumber);
		anotherNumber = 20;
		System.out.println(anotherNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printTable(0);
		// printTable(5);

		int number = 10;
		System.out.println(number);
		testFunction(number);
		System.out.println(number);

	}
}
