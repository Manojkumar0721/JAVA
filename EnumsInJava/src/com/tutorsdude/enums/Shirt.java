package com.tutorsdude.enums;

import com.tutorsdude.enums.constants.Material;
import com.tutorsdude.enums.constants.Pocket;
import com.tutorsdude.enums.constants.Size;
import com.tutorsdude.enums.constants.Sleeves;

public class Shirt {
	
	Material material;
	Sleeves sleeves;
	Pocket pocket;
	int price;
	Size size;
	
	public Shirt(Material material,Sleeves sleeves,Pocket pocket,int price,Size size) {
		this.material = material;
		this.sleeves = sleeves;
		this.pocket = pocket;
		this.price = price;
		this.size = size;
	}
	

}
