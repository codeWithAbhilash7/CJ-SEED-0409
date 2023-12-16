package com.exceptions.throwandthrows;

import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		Student s1 = new Student("Jon");
		
		Scanner sc = new Scanner(System.in);
		try  {
			s1.setMarks(-87);
			System.out.println(s1);

		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
			e.printStackTrace();
		}
	}

}
