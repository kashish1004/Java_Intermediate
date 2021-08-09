package com.phoenix.wrapper.main;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class AutoBoxingUnboxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		float f1 = a; //implict conversion
		byte by = (byte) a; //explicit conversion
		Integer ob = Integer.valueOf(a); // wrapping
		Float f = Float.valueOf(a); //wrapping and implicit conversion
		System.out.println("f: "+f);
		System.out.println("ob: "+ob);
		Integer b = 500;
		int y = b.intValue(); //unwrapping
		System.out.println("Y:" +y);
		Integer i = a; // Autoboxing
		System.out.println("i: "+i);
		Integer i1 = 100;
		int c = i1; //Autounboxing
		System.out.println("c: "+c);
	}

}
