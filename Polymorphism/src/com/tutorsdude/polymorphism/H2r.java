package com.tutorsdude.polymorphism;

public class H2r extends Bike{
	
	public void noOfCylinders() {
		super.noOfCylinders();
		System.out.println("Kawasaki Ninja H2R Have 4 Cylinders");
	}
	
	public void roadLegal() {
		super.roadLegal();
		System.out.println("Kawasaki Ninja Is Not A Road Legal Bike It's A Track Bike");
	}

}
