package com.sorting;

import java.util.Comparator;

import com.sets.Student;

public class StundetsUtility {

	public static final Comparator<Student> sortByMarksDesc = (Student o1,
			Student o2) -> (int) (o2.getMarks() - o1.getMarks());
	public static final Comparator<Student> sortByMarksAsc = (Student o1,
			Student o2) -> (int) (o1.getMarks() - o2.getMarks());

	public static final Comparator<Student> sortByNameDesc = (Student o1, Student o2) -> o2.getName()
			.compareTo(o1.getName());
	public static final Comparator<Student> sortByNAmeAsc = (Student o1, Student o2) -> o1.getName()
			.compareTo(o2.getName());

}
