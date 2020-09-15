package com.saiparesh.bankaccountapp;

public class Checkings extends Account {
	// List properties specific to checkings account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//Constructor to initialize checking account properties
	public Checkings(String name, String sSn, double balance) {
		super(name,sSn, balance);
		accountNumber = "2" + accountNumber;
		setDebitCard();

	}
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()* .15;
	}
	//List any method specific to checking account
	
	@Override
	public void showInfo() {
		System.out.println("Account Type : Checking");
		super.showInfo();
		System.out.println(
				"Checking Account Features : " + 
				"\n Debit Card Number : " + debitCardNumber +
				"\n Debit card PIN : " + debitCardPIN				
				);
	}
}
