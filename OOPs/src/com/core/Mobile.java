package com.core;

public class Mobile {

	public String toString() {
		return "Mobile [make=" + make + ", model=" + model + ", ram=" + ram + ", storage=" + storage + ", camera="
				+ camera + "]";
	}

	private String make;
	private String model;
	private int ram;
	private int storage;
	private int camera;

	public Mobile() {
		this.camera = 0;
		this.make = "";
		this.model = "";
		this.ram = 0;
		this.storage = 0;
	}

	public Mobile(String make, String model, int ram, int storage, int camera) {
		this.camera = camera;
		this.make = make;
		this.model = model;
		this.ram = ram;
		this.storage = storage;
	}

	public Mobile(String make, String model) {
		this.camera = 0;
		this.make = make;
		this.model = model;
		this.ram = 0;
		this.storage = 0;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	public int getRam() {
		return this.ram;
	}
	
	public int getStorage() {
		return this.storage;
	}

}
