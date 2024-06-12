package com.tutorsdude.polymorphism;

public class OldMonk extends Drinks {
	
	@Override
	public void typesOfDrinks() {
		super.typesOfDrinks();
		System.out.println("Old Monk is a Vatted Indian Dark Rum");
	}
	
	@Override
	public void alcoholDrinks() {
		super.alcoholDrinks();
		System.out.println("Old Monk Is A Alcohol Drinks");
	}

}
