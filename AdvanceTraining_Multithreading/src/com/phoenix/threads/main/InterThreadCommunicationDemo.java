package com.phoenix.threads.main;

import com.phoenix.threads.DataPrinterThread;
import com.phoenix.threads.DataRecieverThread;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = new int[5];
			Thread t1 = new DataRecieverThread(arr);
			Thread t2 = new DataPrinterThread(arr);
			
			t2.start();
			t1.start();
			
	}

}
