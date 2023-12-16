package com.threading.sync;

class Printer {
	public void print(String documentName, int noOfPages) {
		for (int i = 1; i <= noOfPages; i++) {
			System.out.println("Printing " + documentName + "\tPageNo#" + i);
		}
	}
}

class User extends Thread {
	private String documentName;
	private int noOfPages;

	private Printer pRef;

	public User(String documentName, int noOfPages, Printer pRef) {
		super();
		this.documentName = documentName;
		this.noOfPages = noOfPages;
		this.pRef = pRef;
	}

	@Override
	public void run() {
		pRef.print(documentName, noOfPages);
	}

}

public class App {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		User u1 = new User("User_1_Document_1", 9, printer);
		User u2 = new User("User_2_Document_2", 5, printer);
		
		u1.start();
		u2.start();
	}
}
