package com.phoenix.interfaces.functional;
/*
 * @author kashish.jain@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static method reference
		Movable m = MyClass::aMethod;
		m.move();
		//instance method reference on specific object
		YourClass y = new YourClass();
		m = y::yourMethod;
		m.move();
		// instance method reference on arbitrary object
		StringMerger sm = String::concat;
		System.out.println(sm.merge("Hello", " World"));
		//constructor reference
		Messaging mg = Message::new;
		Message ob = mg.getInstance("abc");
		System.out.println(ob.getMsg());
	}

}
