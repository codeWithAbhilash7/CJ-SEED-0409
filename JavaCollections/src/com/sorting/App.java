package com.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.sets.Student;

public class App {

	public static void main(String[] args) {
		List<Student> students = new LinkedList<Student>();

		add(students);
//		print(students);
//		Collections.sort(students);
//		print(students);
//		Collections.sort(students, new SortByName());
//		print(students);

//		Comparator<Student> sortByMarks = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return (int) (o2.getMarks() - o1.getMarks());
//			}
//		};

//		Comparator<Student> sortByMarks = (Student o1, Student o2) -> (int) (o2.getMarks() - o1.getMarks());

		Collections.sort(students, StundetsUtility.sortByMarksAsc);
		print(students);
		Collections.sort(students, StundetsUtility.sortByMarksDesc);
		print(students);
		Collections.sort(students, StundetsUtility.sortByNAmeAsc);
		print(students);
		Collections.sort(students, StundetsUtility.sortByNameDesc);
		print(students);
	}

	private static void add(List<Student> students) {
		students.add(new Student(1, "Tanvi", 78.65));
		students.add(new Student(5, "Shraddha", 39.99));
		students.add(new Student(4, "Bhakti", 86.45));
		students.add(new Student(3, "Amit", 68.48));
		students.add(new Student(2, "Shraddha", 95.45));
	}

	private static void print(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("------------------------------------------------");
	}

}
