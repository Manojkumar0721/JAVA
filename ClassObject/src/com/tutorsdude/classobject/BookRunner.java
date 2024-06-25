package com.tutorsdude.classobject;

public class BookRunner {

	public static void main(String[] args) {
		
		Book book = new Book("To Kill A Mockingbird","Herper Lee");
		Book book1 = new Book("Hamlet","Willium Shakespeare");
		
        boolean value = book.equals(book1);
        System.out.println(value);
        
        int hashCode = book.hashCode();
        System.out.println(hashCode);
        
        int hashCode1 = book1.hashCode();
        System.out.println(hashCode1);

	}

}
