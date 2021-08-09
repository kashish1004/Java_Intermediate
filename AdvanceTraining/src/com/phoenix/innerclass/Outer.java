package com.phoenix.innerclass;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class Outer {
	
	private static int i = 20;
	public void show() {
		System.out.println(" Outer Class I:" + i);
	}
	public static class Inner{
		private int j = 10;
		public void test() {
			System.out.println("static class J: " + j);
			System.out.println("static class I: "+ i);
		}
	}
}