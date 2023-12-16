package com.generics;

class Test<T, V> {
	T var;
	V another;

	public Test(T var, V another) {
		super();
		this.var = var;
		this.another = another;
	}

	T getValue() {
		return var;
	}

	V getAnother() {
		return another;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer, Double> intVal = new Test<>(10, 12.15);
		System.out.println(intVal.getValue());
		System.out.println(intVal.getAnother());
		
		Test<String, Boolean> stringVal = new Test<>("ABCD", true);
		System.out.println(stringVal.getValue());
	}

}
