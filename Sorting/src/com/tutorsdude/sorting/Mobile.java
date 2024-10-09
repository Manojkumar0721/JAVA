package com.tutorsdude.sorting;

public class Mobile implements Comparable<Mobile> {

	private String name;
	private int price;
	private float rating;
	private int warranty;

	public Mobile(String name, int price, float rating, int warranty) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.warranty = warranty;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public float getRating() {
		return rating;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", rating=" + rating + ", warranty=" + warranty + "]";
	}

	@Override
	public int compareTo(Mobile o) {
		return this.getName().compareTo(o.getName());
	}

}
