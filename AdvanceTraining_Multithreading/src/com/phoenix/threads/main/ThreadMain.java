package com.phoenix.threads.main;

import com.phoenix.threads.MyThread;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Thread in main: "+Thread.currentThread().getName());
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.setName("First");
		t2.setName("Second");
		t1.setPriority(2);
		t2.setPriority(8); 
		t1.start();
		t2.start();
	}

}
