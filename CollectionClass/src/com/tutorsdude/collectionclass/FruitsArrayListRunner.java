package com.tutorsdude.collectionclass;

import java.util.ArrayList;

public class FruitsArrayListRunner {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		
//      create
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		System.out.println("After adding fruits : " + fruits);
		
//      Read  		
		
	    String firstFruit = fruits.get(0);
	    System.out.println("First Fruit : " + firstFruit);
	    
//      Update	    
	    
	    fruits.set(1, "Blueberry");
	    System.out.println("After updating Second element : " + fruits);
	    
//      Delete	    
	    
	    fruits.remove(2);
	    System.out.println("After removing Third fruit : " + fruits);
	    
	    System.out.println("Final arrayList : " + fruits);
		
		

	}

}
