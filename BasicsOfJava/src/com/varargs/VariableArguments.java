package com.varargs;

public class VariableArguments {

	private static int add(int... number) {
		int result = 0;
		for (int i : number) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1));
		add(1, 2);
//		add(1, 2, 3);
//		add(1, 2, 3, 4);
//		add(1, 2, 3, 4, 5);
		System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

}
