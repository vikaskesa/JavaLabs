package com.capgemini.Lab.inheritance;

public class CurrentAccount extends Account {
	public final double overdraftLimit=500; 
	public void withdraw() {
		if(getBalance()<overdraftLimit) {
			System.out.println("Taansaction allowed");
		}
		else
			System.out.println("Transaction not allowed");
	}

}
