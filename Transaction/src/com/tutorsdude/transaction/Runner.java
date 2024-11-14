package com.tutorsdude.transaction;

import com.tutorsdude.transaction.customexception.AccountInactiveException;
import com.tutorsdude.transaction.customexception.InsuficientBalanceException;
import com.tutorsdude.transaction.customexception.LimitExeededException;

public class Runner{
	
	public static void main(String[] args) {
		
		
		
		Person manoj = new Person("Manoj",100,"Active");
		Person sarvam = new Person("Sarvam",5000,"Active");
		Person sai = new Person("Sai",20000,"Active");
		Person akhil = new Person("Akhil",50000,"Active");
		
		try {
			makePayment(3000,sai,sarvam);
		} catch (LimitExeededException e) {
			message("Limit is exeeded plz check ones agian");
			e.printStackTrace();
		} catch (AccountInactiveException e) {
			message("Account is Inactive plz check");
			e.printStackTrace();
		}catch(InsuficientBalanceException e) {
			message("you have insuficient balance to make payment");
			e.printStackTrace();
		}
		
	}
	public static boolean makePayment(int amount,Person sender,Person receiver) throws LimitExeededException, AccountInactiveException, InsuficientBalanceException {
		
		if(amount>200000) {
			throw new LimitExeededException();
		}
		
		if(sender.getAccountStatus() == "Inactive" |receiver.getAccountStatus() == "Inactive") {
			throw new AccountInactiveException();
		}
	
		if(sender.getBalance()<amount) {
			throw new InsuficientBalanceException();
		}
		
		int currentReceiverBalance = receiver.getBalance();
		int currentSenderBalance = sender.getBalance();
		
		int updatedReceiverBalance = currentReceiverBalance + amount;
		int updatedSenderBalance = currentSenderBalance - amount;
		
		receiver.setBalance(updatedReceiverBalance);
		sender.setBalance(updatedSenderBalance);
		
		System.out.println(sender);
		System.out.println(receiver);
		
		
			
		return true;
	}
	
	public static void message(String message) {
		
		System.out.println(message);
		
	}
	
	
	
	
	
	
	

}
