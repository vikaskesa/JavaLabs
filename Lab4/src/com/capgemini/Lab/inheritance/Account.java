package com.capgemini.Lab.inheritance;
import java.util.Random;   
public class Account {
	private static long accNum;
	private double balance;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double money) {
		balance+=money;
	}
	public void withdraw(double money) {
		balance-=money;
	}
	public double getBalance() {
		return balance;
	}
	public static void main(String[] args) {
		Random random = new Random();  
		int x = random.nextInt(1000); 
		int y=random.nextInt(1000);
		
		Account acc=new SavingsAccount();
		acc.withdraw(2000);
		
		Account acc2=new CurrentAccount();
		acc.withdraw(1000);
		
		
		Account smith=new Account();
		smith.setAccNum(x);
		smith.setBalance(2000.0);
		Person p=new Person();
		p.setName("smith");
		p.setAge(22);
		smith.setAccHolder(p);
		
		Account kathy=new Account();
		kathy.setAccNum(y);
		kathy.setBalance(3000.0);
		Person p1=new Person();
		p1.setName("kathy");
		p1.setAge(25);
		
		smith.deposit(2000.0);
		double m3=smith.getBalance();
		System.out.println(m3);
		kathy.withdraw(2000.0);
		double m4=kathy.getBalance();
		System.out.println(m4);	
		
	}
	
}
