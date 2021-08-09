package com.phoenix.innerclass.main;

/*
 * @author kashish.jain@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import com.phoenix.innerclass.Outer;


public class StaticInnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ot = new Outer();
		Outer.Inner in = new Outer.Inner();
		ot.show();
		in.test();		
		//another way of creating object of inner static class
		Outer.Inner oi = new Outer.Inner();
		oi.test();
		
	}
}
