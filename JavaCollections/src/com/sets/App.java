package com.sets;

import java.util.HashSet;
import java.util.Set;

public class App {
	private static Set<String> students = new HashSet<String>();

	public static void main(String[] args) {
//		addToSet();
//		print();
//
//		for (String student : students) {
//
//			if (student.equals("Daya")) {
//				System.out.println("removing daya");
//				students.remove("Daya");
//				break;
//			}
//		}
//
//		print();
		
		
		

	}

	private static void print() {
		System.out.println(students);
	}

	private static void addToSet() {
		students.add("Shraddha");
		students.add("Tanvi");
		students.add("Amit");
		students.add("Shraddha");
		students.add("Daya");
		students.add("Abhilash");
		//
		students.add(null);
	}

}
