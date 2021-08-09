package com.phoenix.vehicles.main;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import com.phoenix.vehicles.Car;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(101, "Honda City", 1000000.00f);
		Car car2 = new Car(101, "Honda City", 1000000.00f);
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println("Hashcode of s1: "+s1.hashCode());
		System.out.println("Hashcode of s2: "+s2.hashCode());
		System.out.println("Hashcode of car1: "+car1.hashCode());
		System.out.println("Hashcode of car2: "+car2.hashCode());
		if(s1.hashCode() == s2.hashCode())
			System.out.println("Same");
		else
			System.out.println("Different");
		if(car1.hashCode() == car2.hashCode())
			System.out.println("Same");
		else
			System.out.println("Different");
	}

}
