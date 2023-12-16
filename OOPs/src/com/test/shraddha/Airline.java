package com.test.shraddha;

public class Airline {
	private String flight;
	private String pName;
	private int id;
	private double weight;
	
	/*Airline(){
		this.flight="Spicejet";
		this.id=0;
		this.pName="";
		this.weight=15;
	}*/

	@Override
	public String toString() {
		return "Airline [flight=" + flight + ", pName=" + pName + ", id=" + id + ", weight=" + weight + "]";
	}
	
	Airline(String flight,String pName,int id,double weight)
	{
		this.flight=flight;
		this.id=id;
		this.pName=pName;
		this.weight=weight;
	}
	public void setFlight(String flight)
	{
		this.flight=flight;
	}
	public String getFlight()
	{
		return this.flight;
	}
	
}
