package com.tutorsdude.typecasting;

public class UpCastingRunner {

	public static void main(String[] args) {
		
		byte byteValue = 127;
		float floatValue = byteValue;
		double doubleValue = floatValue;
		
	    System.out.println(byteValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
		short shortValue = 2000;
		int intValue = shortValue;
		long longValue = intValue;
		
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		
		float floatvalue = 123.9999f;
		double doublevalue = floatvalue;
		
		System.out.println(floatvalue);
		System.out.println(doublevalue);
		
	
	}

}
