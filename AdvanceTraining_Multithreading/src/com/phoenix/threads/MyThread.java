package com.phoenix.threads;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class MyThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 0;i<5;i++) {
				System.out.println("Current Thread: "+Thread.currentThread());
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
