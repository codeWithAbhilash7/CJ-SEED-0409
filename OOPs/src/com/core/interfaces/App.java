package com.core.interfaces;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s22 = new Samsung("S22 Pro",256, 16, 48);
		IPhone i14 = new IPhone("13 Pro", 512, 8, 256);
		System.out.println(s22);
		System.out.println(i14);
	}

}
