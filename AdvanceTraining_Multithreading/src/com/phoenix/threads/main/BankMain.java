package com.phoenix.threads.main;

import com.phoenix.models.Account;
import com.phoenix.threads.AccountThread;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(12345, "Mr. and Mrs. Mehra", 10000.0f);
		Thread t1 = new AccountThread(account, true, 3000.0f);
		t1.setName("Mr. Mehra");
		Thread t2 = new AccountThread(account, false, 4000.0f);
		t2.setName("Mrs. Mehra");
		
		t1.start();
		t2.start();
		
	}

}
