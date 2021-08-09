package com.phoenix.innerclass.main;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import com.phoenix.innerclass.Account;
import com.phoenix.innerclass.Account.Locker;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(100, "ABC DEF");
		Locker l = ac.new Locker(1005, "ABC");
		System.out.println(ac);
		System.out.println(l);
		l.unlock();
		l.keepThings();
		l.lock();
		//another way of creating object of locker
		Account.Locker al = new Account(100, "ABC DEF").new Locker(1005, "ABC");
		System.out.println(al);
	}

}
