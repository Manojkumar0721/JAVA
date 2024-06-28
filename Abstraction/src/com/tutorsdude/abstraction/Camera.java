package com.tutorsdude.abstraction;

public abstract class Camera {
	
	public abstract void lense();
	
	public abstract void display();
	
	public abstract void modeSwitch();
	
    public void shutterSpeed() {
    	System.out.println("It's the speed at which the shutter of the camera closes");
    }
    
    public void video() {
    	System.out.println("In camera we Shoot videos also");
    }
}
