package com.anonymous;

@FunctionalInterface
interface Greetable {
	void greet();
}

@FunctionalInterface
interface Addable {
	int add(int no1, int no2);
}

public class App {

	public static void main(String[] args) {

		// Anonymous class
//		Greetable g = new Greetable() {
//
//			@Override
//			public void greet() {
//				System.out.println("Hello");
//
//			}
//
//		};
//		g.greet();

		// lambda function
		// paramters -> method definition
//		Greetable g = () -> {
//			System.out.println("Hello");
//			System.out.println("Hi");
//		};
//		g.greet();

		Addable addition = (int no1, int no2) -> no1 + no2;
		System.out.println(addition.add(56, 54));
		// Anonymous object
//		new Greetable() {
//
//			@Override
//			public void greet() {
//				System.out.println("Hello");
//
//			}
//
//		}.greet();

	}

}
