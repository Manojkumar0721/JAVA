package com.tutorsdude.abstraction;

public class AbstractionRunner {

	public static void main(String[] args) {
		
		Camera camera1 = new Canon();
		camera1.lense();
		camera1.display();
		camera1.modeSwitch();
		camera1.shutterSpeed();
		camera1.video();
		
		Camera camera2 = new Nikon();
		camera2.lense();
		camera2.display();
		camera2.modeSwitch();
		camera2.shutterSpeed();
		camera2.video();
		
		Camera camera3 = new Sony();
		camera3.lense();
		camera3.display();
		camera3.modeSwitch();
		camera3.shutterSpeed();
		camera3.video();
		
	
	}

}
