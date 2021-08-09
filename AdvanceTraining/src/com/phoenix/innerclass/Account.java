package com.phoenix.innerclass;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class Account {
	private int accNo;
	private String ownerName;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accNo, String ownerName) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
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

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + "]";
	}

	public class Locker{
		private int id;
		private String label;
		public Locker() {
			// TODO Auto-generated constructor stub
		}
		public Locker(int id, String label) {
			super();
			this.id = id;
			this.label = label;
		}
		public void keepThings() {
			System.out.println("Things kept");
		}
		public void unlock() {
			System.out.println("unlocked");
		}
		public void lock() {
			System.out.println("Locked");
		}
		@Override
		public String toString() {
			return "Locker [id=" + id + ", label=" + label + "]";
		}
		
	}
	
}
