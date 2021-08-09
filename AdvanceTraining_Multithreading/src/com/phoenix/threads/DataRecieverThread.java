package com.phoenix.threads;

import java.util.Scanner;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class DataRecieverThread extends Thread {
	int arr[];

	public DataRecieverThread(int[] arr) {
		super();
		this.arr = arr;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			synchronized (arr) {
				Scanner sc = new Scanner(System.in);
				for(int i = 0;i<arr.length;i++) {
					System.out.println("Enter Data: ");
					int data = sc.nextInt();
					arr[i] = data;
					Thread.sleep(200);
				}
				arr.notify(); //can only be called on locked object otherwise exception will be thrown
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
