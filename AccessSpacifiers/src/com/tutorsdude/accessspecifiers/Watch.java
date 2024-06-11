package com.tutorsdude.accessspecifiers;

public class Watch {
    public String brandName;
    public String functionality;
    public int price;
	
	public void watchBrand() {
		System.out.println("Rolex");
	}
	
	public Watch(String brandName,String functionality,int price) {
		this.brandName = brandName;
		this.functionality = functionality;
		this.price = price;
	}
	
	

 }
