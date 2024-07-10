package com.tutorsdude.crudoperation;

public class Repository {
	
	private String[] names = new String[10];
	
	public boolean saveName(String name) {
		if(name!=null) {
			if(!name.isEmpty()) {
				if(name.length()>3) {
					if(name.length()<12) {
			for(int i = 0; i<names.length;i++) {
				if(names[i]==null) {
					names[i]=name;
					System.out.println("Name saved At index : "+ i +" : "+ names[i]);
					return true;
				}
				System.out.println("Moving next place to check : " + i);
			}
			System.out.println("All places are filled with Name There is No Space to fill a Name");
			return false;
					}
					System.out.println("Insertend Name Length is more than 12 plz Enter Name of Length less than 12");
					return false;
				}
				System.out.println("Inserted Name Length is less than 3 Plz Enter More than 3 Leter name");
				return false;
			}
			System.out.println("Inserted value is Not valid");
			return false;
		}
		System.out.println("Name is Null");
		return false;
	}
	
	public void readName() {
		for(int i = 0;i<this.names.length;i++) {
			if(names[i]!=null) {
			System.out.println(names[i]);
			}
		}
	}
	

}
