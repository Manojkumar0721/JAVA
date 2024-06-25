package com.tutorsdude.classobject;

public class EmployeeRunner {
	
           
	public static void main(String[] args) {
			    
		EmployeeTest employee = new EmployeeTest("Manoj", "Kumar");
	    System.out.println(employee.toString());
	    
	    int hashCode = employee.hashCode();
        System.out.println(hashCode);
			

	}

}
