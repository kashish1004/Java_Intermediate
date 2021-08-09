package com.phoenix.models;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class Account {
	
	private int accNo;
	private String ownerName;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accNo, String ownerName, double balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	//business logic
	public synchronized void withdraw(double amount) throws InterruptedException {
		double currentBalance = getBalance();
		System.out.println("Balance before withdraw: "+currentBalance+" seen by "+ Thread.currentThread().getName());
		currentBalance -= amount;
		Thread.sleep(1000);
		setBalance(currentBalance);
		currentBalance = getBalance();
		System.out.println("Balance after withdraw: "+currentBalance+" seen by "+ Thread.currentThread().getName());
		Thread.sleep(1000);
	}
	
	public void deposit(double amount) throws InterruptedException {
		System.out.println("Hello");
		synchronized (this) {
			double currentBalance = getBalance();
			System.out.println(
					"Balance before deposit: " + currentBalance + " seen by " + Thread.currentThread().getName());
			currentBalance += amount;
			Thread.sleep(1000);
			setBalance(currentBalance);
			currentBalance = getBalance();
			System.out.println(
					"Balance after deposit: " + currentBalance + " seen by " + Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		System.out.println("BYE");
	}
	
}
