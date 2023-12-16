package com.oops.inheritance;

import java.util.Scanner;

public class DriverClass {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * This method prints all records present in the array
	 * 
	 * @param employee records to print on console
	 */
	public static void printRecords(Employee[] employee) {
		for (Employee emp : employee) {
			System.out.println(emp);
		}
	}

	/**
	 * This method creates objects of Employee class
	 * 
	 * @returns object of Employee class
	 */
	public static Employee getNewEmployeeRecord() {
		System.out.print("Enter age of the employee :: ");
		int age = sc.nextInt();
		System.out.print("Enter name of the employee :: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter address of the employee :: ");
		String address = sc.nextLine();
		System.out.print("Enter salary of the employee :: ");
		double salary = sc.nextDouble();

		return new Employee(name, address, age, salary);
	}

	public static int printMenu() {
		System.out.println("\n1. Add new employee");
		System.out.println("2. Display all records");
		System.out.println("3. Update record");
		System.out.println("0. Exit");
		System.out.print("Enter your choice :: ");
		return sc.nextInt();
	}

	public static void updateRecord(Employee[] emp) {
		// accept user id from user
		boolean isFound = false;
		System.out.print("Enter the employee id :: ");
		int id = sc.nextInt();
		// parse array
		for (int i = 0; i < emp.length && emp[i] != null; i++) {

			// check whether employee id and id given by user are equal
			if (id == emp[i].getEmployeeId()) {
				isFound = true;
				System.out.print("Enter the new salary :: ");
				double salary = sc.nextDouble();
				// if yes, update the record
				emp[i].setSalary(salary);
				System.out.println("Record updated successfully...");
				break;
			}
		}

		if (isFound == false) {
			// if no, print an error msg
			System.out.println("Not found");
		}

	}

	public static void main(String[] args) {
		System.out.print("Enter total number of employees :: ");
		int size = sc.nextInt();

		Employee[] employee = new Employee[size];
		int choice = 0, index = 0;
		do {
			choice = printMenu();
			if (choice != 0) {
				switch (choice) {
				case 1:
					if (index < size) {
						employee[index++] = getNewEmployeeRecord();
					} else {
						System.out.println("We do not have enough space to store new records...\n");
					}
					break;
				case 2:
					printRecords(employee);
					break;
				case 3:
					updateRecord(employee);
					break;
				default:
					System.out.println("Invalid choice. Try again...\n");
				}
			}

		} while (choice != 0);

	}

}
