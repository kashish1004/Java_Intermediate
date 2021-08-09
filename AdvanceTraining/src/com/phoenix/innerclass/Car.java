package com.phoenix.innerclass;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class Car {
		public void show() {
			f.drive();
			d.drive();
		}
		Ferrari f = new Ferrari() {
			public void drive() {
				System.out.println("Anonymous Inner Class Of Ferrari");
			}
		};
		Drivable d = new Drivable() {
			@Override
			public void drive() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Inner Class Of Drivable Interface");
			}
		};
		
	}

