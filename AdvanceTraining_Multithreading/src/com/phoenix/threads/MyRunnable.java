package com.phoenix.threads;

import java.util.ArrayList;
import java.util.List;
/*
 * @author kashish.jain@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		List<String> cities = new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Ahmedabad");
		cities.add("Bengaluru");
		cities.forEach(System.out::println);
	}

}
