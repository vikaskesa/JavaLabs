package com.capgemini.Lab.inheritance;

public class SavingsAccount extends Account{
	final double minimumBalance=500;
	
	public void withdraw(double money) {
		if(getBalance()<minimumBalance) {
			System.out.println("Transaction allowed");
		}
		else
			System.out.println("Transaction not allowed");
		
	}
}
