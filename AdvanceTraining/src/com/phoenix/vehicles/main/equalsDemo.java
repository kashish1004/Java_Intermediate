package com.phoenix.vehicles.main;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import com.phoenix.vehicles.Car;

public class equalsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(101, "Honda City", 1000000.00f);
		Car car2 = new Car(101, "Honda City", 1000000.00f);
		if(car1.equals(car2)) //if overriding is not done in car class then equals method check for reference if it is same it returns true otherwise false
			System.out.println("Same Cars");
		else
			System.out.println("Different cars");
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		if(s1.equals(s2)) 
			System.out.println("Same");
		else
			System.out.println("Different");
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
