package com.tutorsdude.abstraction;

public class Nikon extends Camera{

	@Override
	public void lense() {
		System.out.println("Nikon Gives Diffrent Types Of Camera Lenses");
	}
	
	@Override 
	public void display() {
		System.out.println("Nikon provides screen touch display for beter experiences");
	}
	
	@Override
	public void modeSwitch() {
		System.out.println("Nikon Provides diferent modes for photos and videos");
	}	

}
