package com.tutorsdude.polymorphism;

public class Runner {

	public static void main(String[] args) {
		
		Device device = new Device();
		device.printDetails();
		device.colourPrint();
		
		System.out.println("***************************************************************");
		
		Printer printer = new Printer();
		printer.printDetails();
		printer.colourPrint();
		
		System.out.println("***************************************************************");
		
		Drinks drinks = new Drinks();
		drinks.typesOfDrinks();
		drinks.alcoholDrinks();
		
		
		System.out.println("***************************************************************");
		
		OldMonk oldMonk = new OldMonk();
		oldMonk.typesOfDrinks();
		oldMonk.alcoholDrinks();
		
		System.out.println("***************************************************************");
		
		Bike bike = new Bike();
		bike.noOfCylinders();
		bike.roadLegal();
		
		System.out.println("***************************************************************");
		
		H2r h2r = new H2r();
		h2r.noOfCylinders();
		h2r.roadLegal();
		
		

	}

}
