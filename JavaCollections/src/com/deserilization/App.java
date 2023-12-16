package com.deserilization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.Student;

public class App {

	public static void main(String[] args) {
		List<Student> students = new LinkedList<Student>();

		try {
			FileInputStream fis = new FileInputStream("Students.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = null;
			do {

				obj = ois.readObject();
				Student s = (Student) obj;
				students.add(s);
			} while (obj != null);

			ois.close();
			fis.close();

		} catch (EOFException eof) {
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		try (FileInputStream fis = new FileInputStream("Students.txt");
//				ObjectInputStream ois = new ObjectInputStream(fis)) {
//
//			Object obj = null;
//			Student student = null;
//			do {
//
//				obj = ois.readObject();
//				if (obj instanceof Student) {
//					student = (Student) obj;
//					students.add(student);
//				}
//			} while (obj != null);
//		} catch (EOFException eof) {
//			System.out.println("Object stored in collection");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		for (Student student : students) {
			System.out.println(student);
		}

	}

}
