package com.phoenix.interfaces.functional;

public class C implements A, B {// both a and b have same default method test so we have to override that method
	public void testC() {
		System.out.println("c");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		A.super.test();
	}
}
