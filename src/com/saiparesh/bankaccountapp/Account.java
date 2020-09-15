package com.saiparesh.bankaccountapp;

public abstract class Account implements IBaseRate{
	//List Common properties for checking and savings account
	private String name;
	private String sSn;
	private double balance;
	protected String accountNumber; 
	protected double rate;
	private static int index = 10000;
	
	//Constructor to set base properties
	public Account(String name, String sSn, double balance) {
		this.name = name;
		this.sSn = sSn;
		this.balance = balance;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSn.substring(sSn.length() - 2, sSn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	//List common methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your Balance is $" + balance);
	}
	public void showInfo() {
		System.out.println(
				"Name : " + name +
				"\nAccount Number : " + accountNumber +
				"\nBalance : " + balance + 
				"\nRate : " + rate + "%"
				);	
	}
}
