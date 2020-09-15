package com.saiparesh.bankaccountapp;

public class Savings extends Account {
	// List properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize saving account properties
	public Savings(String name, String sSn, double balance) {
		super(name,sSn, balance);
		accountNumber = "1" + accountNumber;

		setSafetyDepositBox();
	}	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	//List any method specific to saving account
	
	@Override
	public void showInfo() {
		System.out.println("Account Type : Savings");
		super.showInfo();
		System.out.println(
				" Saving Account features:" +
				"\n Safety Deposit ID : " + safetyDepositBoxID + 
				"\n Safety Deposit Key : " + safetyDepositBoxKey
				);
	}
}
