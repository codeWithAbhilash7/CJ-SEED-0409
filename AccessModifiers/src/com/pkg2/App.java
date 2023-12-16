package com.pkg2;

import com.pkg1.Parent;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		//p.defaultMethod();
		//p.protectedMethod();
		p.publicMethod();
		
		int i = 10;
		boolean b = i != 0 ? true : false;
		
	}

}
