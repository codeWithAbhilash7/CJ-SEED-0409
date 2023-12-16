package com.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {

	private static Set<Student> students = new TreeSet<Student>();

	public static void main(String[] args) {
		students.add(new Student(1, "Tanvi", 78.65));
		students.add(new Student(2, "Shraddha", 95.45));
		students.add(new Student(3, "Amit", 68.48));
		students.add(new Student(4, "Bhakti", 86.45));
		students.add(new Student(5, "Shraddha", 91.68));

		for (Student student : students) {
			System.out.println(student);
		}

	}

}
