package com.tutorsdude.transaction;

public class Person {
	
	private String name;
    private int balance;
	private String accountStatus;
	
	public Person() {
		
	}
	
	public Person(String name,int balance,String accountStatus){
		this.name = name;
		this.balance = balance;
		this.accountStatus = accountStatus;
	}

	

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", balance=" + balance + ", accountStatus=" + accountStatus + "]";
	}

	
	
    
	

}
