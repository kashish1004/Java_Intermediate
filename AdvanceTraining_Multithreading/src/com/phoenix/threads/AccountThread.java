package com.phoenix.threads;

import com.phoenix.models.Account;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class AccountThread extends Thread {
	private Account account;
	private boolean flag;
	private double amount;
	
	public AccountThread() {
		// TODO Auto-generated constructor stub
	}

	public AccountThread(Account account, boolean flag, double amount) {
		super();
		this.account = account;
		this.flag = flag;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			if(flag == true)
				account.deposit(amount);
			else 
				account.deposit(amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
