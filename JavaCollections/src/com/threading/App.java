package com.threading;

class Cleaner implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("#### We are cleaning the code... #### ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Printer extends Thread {
	private String name;

	public Printer(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " is printing #" + i);
		}
	}

}

public class App {

	public static void main(String[] args) {
		System.out.println("Main has started");

		Thread cleaner = new Thread(new Cleaner());

		cleaner.setDaemon(true);
		cleaner.start();

		cleaner.isDaemon();

		Printer p1 = new Printer("P1");
		Printer p2 = new Printer("P2");

		p1.start();
		p2.start();

		System.out.println("Main has finished its execution");
	}

}
