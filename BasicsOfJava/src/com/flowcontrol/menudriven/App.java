package com.flowcontrol.menudriven;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		int employee[] = new int[50];
		int index = 0;
		do {
			choice = printMainMenu();
			switch (choice) {
			case 1:
				employee[index++] = addNewEmployee();
				break;

			case 2:

				break;

			default:
				System.out.println("Error :: Invalid choice.");
				break;
			}
		} while (choice != 0);
		System.out.println("Thank you. Visit again...");
	}

	private static int addNewEmployee() {
		int choice = 0;
		int e = 0;
		do {
			choice = printNewEmployeeMenu();
			switch (choice) {
			case 1:
				//e = createNewHRRecruiter();
				break;

			case 2:
				//e = createNewHRIntern();
				break;

			default:
				System.out.println("Error :: Invalid choice.");
				break;
			}
		} while (choice != 0);
		return e;
	}

	private static int printNewEmployeeMenu() {
		System.out.println("\n1. Add HR Recruiter");
		System.out.println("2. Add HR Intern");
		System.out.println("3. Add Manager");
		System.out.println("0. Back");
		System.out.print("Enter your choice :: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static int printMainMenu() {
		System.out.println("\n1. Add new record");
		System.out.println("2. Print all records");
		System.out.println("3. Update a record");
		System.out.println("0. Exit");
		System.out.print("Enter your choice :: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
