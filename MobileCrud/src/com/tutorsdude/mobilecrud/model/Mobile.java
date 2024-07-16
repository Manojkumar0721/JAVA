package com.tutorsdude.mobilecrud.model;

public class Mobile {
	
	private String brand;
	private int price;
	private String material;
	private boolean isItFoldable;
	
	
	public Mobile(String brand, int price, String material, boolean isItFoldable) {
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.isItFoldable = isItFoldable;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getMaterial() {
		return material;
	}
	public boolean isItFoldable() {
		return isItFoldable;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setItFoldable(boolean isItFoldable) {
		this.isItFoldable = isItFoldable;
	}
	
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", material=" + material + ", isItFoldable="
				+ isItFoldable + "]";
	}
	
	

}
