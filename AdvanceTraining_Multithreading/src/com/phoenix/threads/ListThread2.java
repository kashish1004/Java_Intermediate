package com.phoenix.threads;

import java.util.List;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class ListThread2 extends Thread {
	List<String> cities;
	
	public ListThread2() {
		// TODO Auto-generated constructor stub
	}

	public ListThread2(List<String> cities) {
		super();
		this.cities = cities;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (cities) {//to achieve synchronization
			try {
				cities.set(1, "Tokyo");
				System.out.println(cities);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
