package com.phoenix.string.main;
/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		sb.append("Hello!!!! this is StringBuffer Demo");
		sb.append(".");
		System.out.println(sb);
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		StringBuffer sb1 = new StringBuffer("Hello World");
		System.out.println(sb1);
		System.out.println("Capacity: "+sb1.capacity());
		System.out.println("Length: "+sb1.length());
		String s = sb.reverse().toString();
		System.out.println(s);
	}

}
