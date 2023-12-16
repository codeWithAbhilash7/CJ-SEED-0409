package com.test.nirbhay;

import java.util.Scanner;

public class Subtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the numbers");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter First numbers");
		int n1 = scanner.nextInt();

		System.out.println("Please enter second numbers");
		int n2 = scanner.nextInt();

		int sum = n1 - n2;
		System.out.println("The differnce is: " + sum);
	}

}
