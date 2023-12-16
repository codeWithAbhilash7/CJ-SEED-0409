package com.exceptions.custom;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student s1 = new Student("Xmas");
			s1.setMarks(-78);
		} catch (MarksOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
