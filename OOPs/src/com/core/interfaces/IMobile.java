package com.core.interfaces;

public interface IMobile {
	
	String brand();

	String modelNumber();

	int storage();
	int camera();
	int ram();
	
	default boolean is5GSupported() {
		return true;
	}

}
