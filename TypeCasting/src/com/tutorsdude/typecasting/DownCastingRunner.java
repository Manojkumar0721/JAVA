package com.tutorsdude.typecasting;

public class DownCastingRunner {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Animal animal = dog;
		animal.makeSound();
		
		Ktm ktm = new Ktm();
		Bike bike = ktm;
		bike.brandName();
		
		long longValue = 987654321;
		int intValue = (int) longValue;
		
		System.out.println(intValue);
		
		double doubleValue = 345.64388d;
		float floatValue = (float) doubleValue;
		
		System.out.println(floatValue);
		
		long longvalue = 9876543210l;
		byte byteValue = (byte) longvalue;
		
		System.out.println(byteValue);
		
		float floatNum = 23.4567f;
		int intNum = (int) floatNum;
		
		System.out.println(intNum);
		
		
		
		
		
		
		
		
	}
	

}
