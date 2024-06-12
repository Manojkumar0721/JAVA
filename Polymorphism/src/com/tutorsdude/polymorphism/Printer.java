package com.tutorsdude.polymorphism;

public class Printer extends Device{
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("This Printer Prints The Detail On A Paper");
	}
	
	@Override
	public void colourPrint() {
		super.colourPrint();
		System.out.println("This Printr Prints The Colourd Images On A Papers");
	}

}
