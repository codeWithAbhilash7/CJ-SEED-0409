package com.serilization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import com.Student;

public class App {

	public static void main(String[] args) {
		List<Student> students = new LinkedList<Student>();

		students.add(new Student("Amit", 87.45));
		students.add(new Student("Bhakti", 90.23));
		students.add(new Student("Tanvi", 82.74));
		students.add(new Student("Shraddha", 78.69));
		students.add(new Student("Shraddha", 78.65));

		try {
			FileOutputStream fos = new FileOutputStream("Students.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			for (Student student : students) {
				out.writeObject(student);
				out.flush();
			}
			
			out.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

//		// export to file
//		try (FileOutputStream fos = new FileOutputStream("Students.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//			
//			for (Student student : students) {
//				oos.writeObject(student);
//				oos.flush();
//				System.out.println(student.getName() + " exported to file...");
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
