package com.pkg1;

public class Parent {
	private void privateMethod() {
		System.out.println("Private method of Parent class");
	}
	
	void defaultMethod() {
		System.out.println("Default method of Parent class");
	}

	protected void protectedMethod() {
		System.out.println("Protected method of Parent class");
	}
	
	public void publicMethod() {
		System.out.println("Public method of Parent class");
	}
	
	
	public void testParentMethod() {
		this.privateMethod();
		this.defaultMethod();
		this.protectedMethod();
		this.publicMethod();
	}
	
	
}
