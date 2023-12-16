package com.core.interfaces.diamondproblem;

public class DClass implements InterfaceB, InterfaceC {

	@Override
	public void aMethod() {
		System.out.println("Implmentation of method from A");

	}

	@Override
	public void cMethod() {
		System.out.println("Implmentation of method from C");

	}

	@Override
	public void bMethod() {
		System.out.println("Implmentation of method from B");

	}

}
