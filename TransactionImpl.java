package com.amazonexample;

public class TransactionImpl implements TransactionI{

	@Override
	public void withdraw(int amtToWithraw) {
		System.out.println("end-user important information");
		
	}
	
	void display() {
		System.out.println("logic");
	}

	@Override
	public void balanceCheck() {
		System.out.println("balancecheck");
		
	}

}
