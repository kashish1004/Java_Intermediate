package com.phoenix.innerclass;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class OuterML {
	private int i= 20;
	public void display() {
		int a = 15;
		class Inner{
			private int j = 50;
			public void test() {
				System.out.println("Inner variable j: " + j);
				System.out.println("Method Variable a: " + a);
				System.out.println("Outer variable i: " + i);
			}
		}
		Inner i = new Inner();
		i.test();
	}
}
