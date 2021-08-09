package com.phoenix.threads.main;

import com.phoenix.threads.MyRunnable;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}

}
