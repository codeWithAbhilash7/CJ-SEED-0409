package com.revise;

public class App {

	public static void print(int startPoint, int endPoint) {
		for (int i = startPoint; i <= endPoint; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static int addition(int number1, int number2) {
		int addition = number1 + number2;
		return addition;
	}

	public static void main(String[] args) {
		//print(1, 10);
		//print(50, 75);
		//print(50, 60);
		
		System.out.println(addition(50, 10));
		System.out.println(addition(12, 32));;
		System.out.println(addition(430, 112));;
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//
//		for (int i = 11; i <= 20; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//
//		for (int i = 101; i <= 110; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
	}

}
