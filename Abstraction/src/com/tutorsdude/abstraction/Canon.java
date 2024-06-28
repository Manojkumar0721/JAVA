package com.tutorsdude.abstraction;

public class Canon extends Camera{
	
	@Override
	public void lense() {
		System.out.println("Canon Gives Diffrent Types Of Camera Lenses");
	}
	
	@Override 
	public void display() {
		System.out.println("The LCD works for reviewing photos, displaying menu options and serving as a live viewfinder. Canon cameras contain full-color display screens.");
	}
	
	@Override
	public void modeSwitch() {
		System.out.println("Canon Provides diferent modes for photos and videos");
		
	}
	

}
