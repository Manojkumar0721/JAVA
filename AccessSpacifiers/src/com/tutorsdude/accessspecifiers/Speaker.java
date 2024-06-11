package com.tutorsdude.accessspecifiers;

public class Speaker {
	
	String brand;
	String typeOfConnectivity;
	int price;
	
	public Speaker(String brand,String typeOfConnectivity,int price) {
		this.brand = brand;
		this.typeOfConnectivity = typeOfConnectivity;
		this.price = price;
		
	}
	
	private void getSpeaker() {
		System.out.println("Method Access Specifier is Private");
		
	}
	
	public void info() {
		getSpeaker();
	}

}
