package com.pkg1;

public class Child extends Parent {
	public void testChildMethod() {
		super.publicMethod();
		super.protectedMethod();
		super.defaultMethod();
		//super.privateMethod();
	}
}
