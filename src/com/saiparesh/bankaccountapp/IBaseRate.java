package com.saiparesh.bankaccountapp;

public interface IBaseRate {
	
	// Method that returns base rate
	default double getBaseRate() {
		return 2.5;
	}
}
