package com.tutorsdude.enums.constants;

public enum SizeOfPizza {
	PERSONAL("Personal"),SMALL("Small"),LARGE("Large"),EXTRALARGE("ExtraLarge");
	
	public String detailsOfPizza;

	SizeOfPizza(String detailsOfPizza){
		this.detailsOfPizza = detailsOfPizza;
	}

}
