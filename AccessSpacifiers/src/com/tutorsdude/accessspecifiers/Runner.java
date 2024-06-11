package com.tutorsdude.accessspecifiers;

public class Runner {

	public static void main(String[] args) {
		
		Watch watch = new Watch("Rolex","Analog",10000);
		System.out.println(watch.brandName);
		System.out.println(watch.functionality);
		System.out.println(watch.price);
		
		watch.watchBrand();
		
		
		Speaker speaker = new Speaker("JBL","Wireless",2000);
		System.out.println(speaker.brand);
		System.out.println(speaker.typeOfConnectivity);
		System.out.println(speaker.price);
		
		speaker.info();
		
		
		HeadPhone headPhone = new HeadPhone("Boat",1500,"Plastic");
		System.out.println(headPhone);
		
		
		
		
		
		
		
	}
	

}
