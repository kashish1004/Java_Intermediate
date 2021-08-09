package com.phoenix.string.main;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = new String("Hello");
		if(s1==s2)//gives reference
			System.out.println("Same obj");
		else
			System.out.println("Different obj");
		if(s1.equals(s2))
			System.out.println("Same content");
		else
			System.out.println("Different content");
		String s3 = s1.concat(s2);
		String s4 = s1+s2;
		System.out.println("s1: " +s1);
		System.out.println("s3: " +s3);
		System.out.println("s4: " +s4);
	}

}
