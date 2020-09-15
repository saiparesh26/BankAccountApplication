package com.saiparesh.bankaccountapp;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		
//		Checkings chkAcc1 = new Checkings("David Warner", "34534765", 2400);
//		chkAcc1.showInfo();
//		
//		System.out.println("**************************");
//		Savings svgAcc1 = new Savings("John Doe", "25647813", 3000);
//		svgAcc1.showInfo();
//		svgAcc1.deposit(3000);
//		svgAcc1.withdraw(1000);
//		svgAcc1.transfer("brad", 3000);
		
		//Read a csv file
		String file = "C:\\Users\\sparesh\\Downloads\\NewBankAccounts.csv";
		List<Account> accounts = new LinkedList<>();
		
		List<String[]> newAccounts = utils.CSV.read(file); 
		
		for( String[] account: newAccounts) {
			
			String name = account[0];
			String sSn = account[1];
			String accountType = account[2];
			double initDeposit = Double.parseDouble(account[3]);						
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSn, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checkings(name, sSn, initDeposit));
			}
			else {
				System.out.println("Error reading Account Type");
			}

		}
		
		for(Account account : accounts) {
			account.showInfo();
			System.out.println("\n*****************************\n");
		}
	}

}
