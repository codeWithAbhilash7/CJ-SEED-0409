package com.core.interfaces;

public class IPhone implements IMobile {

	private String modelNumber;
	private int storage;
	private int ram;
	private int camera;

	public IPhone(String modelNumber, int storage, int ram, int camera) {
		super();
		this.modelNumber = modelNumber;
		this.storage = storage;
		this.ram = ram;
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "IPhone [modelNumber=" + modelNumber + ", storage=" + storage + ", ram=" + ram + ", camera=" + camera
				+ "]";
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return "Apple";
	}

	@Override
	public String modelNumber() {
		return this.modelNumber;
	}

	@Override
	public int storage() {
		return this.storage;
	}

	@Override
	public int camera() {
		return this.camera;
	}

	@Override
	public int ram() {
		return this.ram;
	}

}
