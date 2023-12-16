package com.assignment5;

import java.util.Scanner;
import com.string.*;

public class App {
	

	// method to show/display menu to the end user
	public static void showChoices() {
		System.out.println("1. Addition");
		System.out.println("2. Difference");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("0. Exit");
		System.out.print("Enter your choice :: ");
	}

	// method to add 2 integers
	public static int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public static int difference(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			showChoices();
			choice = sc.nextInt();
			
			if(choice == 0)
				break;
			
			if(choice >=  5) {
				System.out.println("Invalid choice... Try again");
				continue;
			}

			System.out.print("Enter first number : ");
			int firstNumber = sc.nextInt();
			System.out.print("Enter second number : ");
			int secondNumber = sc.nextInt();
			int result = 0;
			switch (choice) {
			case 1:
				//System.out.println("Addition is " + add(firstNumber, secondNumber));
				result = add(firstNumber, secondNumber);
				break;
				
			case 2:
				//System.out.println("Addition is " + add(firstNumber, secondNumber));
				result = difference(firstNumber, secondNumber);
				break;

			default:
				break;
			}
			
			System.out.println("Result :: " + result);

		} while (choice != 0);

		sc.close();

	}

}
