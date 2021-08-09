package com.phoenix.interfaces.functional;
/*
 * @author kashish.jain@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

@FunctionalInterface
public interface Addable {
	int add(int a,int b);
	default float addFloat(float a,float b) {
		return a+b;
	}
	static void show() {
		System.out.println("Show of Addable");
	}
}