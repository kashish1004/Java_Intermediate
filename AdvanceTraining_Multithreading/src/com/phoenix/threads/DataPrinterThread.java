package com.phoenix.threads;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class DataPrinterThread extends Thread {
	int arr[];

	public DataPrinterThread(int[] arr) {
		super();
		this.arr = arr;
	}
	
	@Override
	public void run() {
		try {
			synchronized (arr) {
				// TODO Auto-generated method stub
				System.out.println("Waiting to print");
				arr.wait(20); //can only be called on locked object otherwise exception will be thrown
				for (int e : arr) {
					System.out.println(e);
					Thread.sleep(500);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
