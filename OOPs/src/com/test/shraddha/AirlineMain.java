package com.test.shraddha;

public class AirlineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Airline air=new Airline();
		System.out.println(air);*/
		
		Airline air2=new Airline("Indigo","Ambani",1,15);
		System.out.println(air2);
		
		air2.setFlight("AirIndia");
		System.out.println(air2);
	}

}
