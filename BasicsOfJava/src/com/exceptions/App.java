package com.exceptions;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Application started...");
//		do {
//			try {
//			System.out.print("Enter numerator : ");
//			int numerator = sc.nextInt();
//			System.out.print("Enter denominator : ");
//			int denominator = sc.nextInt();
//
//			System.out.println("Line 17 - Try block");
//			int result = divide(numerator, denominator);
//			System.out.println("Line 18 - Try block");
//			System.out.println("Division is " + result);
//
//			System.out.print("Enter 0 to exit or 1 to continue :: ");
//			int choice = sc.nextInt();
//			if (choice == 0)
//				break;
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		} while (true);
//
//		System.out.println("Application has finished its execution...");

		Employee e = null;
		try {
			e = new Employee("Matt", 45);
			e.setAge(10);
		} catch (IllegalAgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(e);
	}

	private static int divide(int numerator, int denominator) {
		// TODO Auto-generated method stub
		int result = 0;
		result = numerator / denominator;
		return result;
	}

}
