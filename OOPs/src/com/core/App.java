package com.core;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

//	public static void changeIt(int number) {
//		System.out.println("Line no 8 : " + number);
//		number = 20;
//		System.out.println("Line no 10 : " + number);
//	}

//	public static void changeIt(Employee e) {
//		System.out.println("Line 12" +e);
//		e.setSalary(2222.22f);
//		System.out.println("Line 14" +e);
//	}
	
	public static int[] evenNumbers (int start, int end) {
		int size = (end - start) / 2;
		int array []= new int[size];
		int index = 0;
		for(int i = start; i <= end; i++) {
			if(i % 2 == 0) {
				//System.out.println(i);
				//even.add(i);
				array[index++] = i;
				
			}
		}
		return array;
	}

	public static void main(String[] args) throws Exception {

//		int mainNumber = 10;
//		System.out.println("Line no 15 : " + mainNumber);
//		changeIt(mainNumber);
//		System.out.println("Line no 17 : " + mainNumber);

//		Student student = new Student(10, "Sanjay", 54.65f);
//		student.getRollNumber();
//		System.out.println(student);
//		student.rollNumber = 1;
//		student.name = "Jon";
//		student.marks = 65.56f;

			// student.print();

//		Student student = new Student();
//		//student.rollNumber = 1;
////		student.name = "Jon";
////		student.marks = 65.56f;
//		
//		System.out.println(student.getRollNumber());
//		if (student.getName().equals("Jon")) {
//			System.out.println(student.getMarks());
//		}
//		
//		System.out.println(student.getMarks());
//		//student.marks = 56465;
//		student.setMarks(56465);
//		System.out.println(student.getMarks());

		
//		Employee emp1 = new Employee(1, "ABCD", 1111.11f);
//		System.out.println("Line 50" + emp1);
//		changeIt(emp1);
//		System.out.println("Line 52" +emp1);

		//Employee emp2 = new Employee(2, "PQRS", 96587.45f);
		//System.out.println(emp2);
		
//		System.out.println("Total Count : " + Employee.count());
//		Employee emp1 = new Employee("ABCD", 1111.11f);
//		System.out.println(emp1);
//		System.out.println("Total Count : " + Employee.count());
//		Employee emp2 = new Employee("ABCD", 1111.11f);
//		System.out.println("Total Count : " + Employee.count());
//		Employee emp3 = new Employee("ABCD", 1111.11f);
//		System.out.println("Total Count : " + Employee.count());
//		Employee emp4 = new Employee("ABCD", 1111.11f);
//		System.out.println("Total Count : " + Employee.count());
//		Employee emp5 = new Employee("ABCD", 1111.11f);
//		System.out.println("Total Count : " + Employee.count());
//		
//		
//		System.out.println(emp1);
//		System.out.println(emp2);
//		System.out.println(emp3);
//		System.out.println(emp4);
//		System.out.println(emp5);
//		System.out.println("Total Count : " + Employee.count());
		
		Scanner sc = new Scanner(System.in);
		
//		Mobile m1 = new Mobile();
//		System.out.println(m1);
//		
//		Mobile m2 = new Mobile("Samsung","S23", 8, 256, 48);
//		System.out.println(m2);
		
		
//		System.out.print("Enter make :: ");
//		String make = sc.next(); 
//		System.out.print("Enter model :: ");
//		String model = sc.next();
//		
//		Mobile m3 = new Mobile(make, model);
//		System.out.println(m3);
//		
//		m3.setRam(16);
//		m3.setStorage(512);
//		
//		System.out.println(m3);
		
		
		Student amit = new Student("Amit");
		System.out.println(amit);
		amit.setChemistry(65);
		amit.setMaths(78);
		amit.setPhysics(98);
		amit.setChemistry(85);
		
		System.out.println(amit);
		

	}

}
