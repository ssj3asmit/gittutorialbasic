package com.amazonexample;

public class Amazon {

	public static void main(String[] args) {
		TransactionI t = new TransactionImpl();
		t.withdraw(10000);
		t.balanceCheck();
		
	//	t.display(); // compile-time-error (because this method belongs to transactionImpl)
	}
}
