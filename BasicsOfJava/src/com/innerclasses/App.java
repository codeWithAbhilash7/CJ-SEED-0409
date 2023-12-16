package com.innerclasses;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outerObj = new Outer(20);
		//Outer.Inner innerObj = outerObj.getInnerObject();
		
//		System.out.println(outerObj);
//		System.out.println(innerObj);
		Outer.inner.display();
	}

}
