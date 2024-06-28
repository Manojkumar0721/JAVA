package com.tutorsdude.abstraction;

public class Sony extends Camera{
	
	@Override
	public void lense() {
		System.out.println("Sony Gives Diffrent Types Of Camera Lenses");
	}
	
	@Override 
	public void display() {
		System.out.println("Sony provides LCD display with screen touch for beter experiences");
	}
	
	@Override
	public void modeSwitch() {
		System.out.println("Sony Provides diferent modes for photos and videos");
	}	

}
