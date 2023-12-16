package com.core.interfaces;

public class Samsung implements IMobile {

	private String modelNumber;
	private int storage;
	private int ram;
	private int camera;
	private int frontCamera;

	public Samsung(String modelNumber, int storage, int ram, int camera) {
		super();
		this.modelNumber = modelNumber;
		this.storage = storage;
		this.ram = ram;
		this.camera = camera;
		this.frontCamera = 8;
	}

	@Override
	public String toString() {
		return "Samsung [modelNumber=" + modelNumber + ", storage=" + storage + ", ram=" + ram + ", camera=" + camera
				+ ", frontCamera=" + frontCamera + "]";
	}

	@Override
	public String brand() {
		return "Samsung";
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

	public int frontCamera() {
		return frontCamera;
	}

}
