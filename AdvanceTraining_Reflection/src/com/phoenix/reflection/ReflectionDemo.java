package com.phoenix.reflection;
/*
 * @author kashish.jain@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.phoenix.models.Product;

public class ReflectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class c = Class.forName("com.phoenix.models.Product");
			Class c = Class.forName("com.phoenix.models.ElectronicProduct");
			System.out.println("loaded");
			
			//creating object of product using reflection
			/*
			 * Product p = (Product)c.newInstance();
			 * System.out.println("Object of Product is created"); p.setId(100);
			 * p.setBrand("OnePlus"); p.setName("Phone"); p.setPrice(49900.0f);
			 * System.out.println(p);
			 */
			Field fArr[] = c.getFields(); //only public fields are retrieved by this
											//method of the class that is loaded by forName
											//method and all  of it's superclass	
			//Field fArr[] = c.getDeclaredFields();//all the fields of only the class that is loaded by forName are retrieved
			for(Field f:fArr) {
				//System.out.println(f.getName());
				System.out.println(f);
			}
			
			System.out.println();
			
			//Method mArr[] = c.getMethods();//all public methods of the class and it's superclass 
			Method mArr[] = c.getDeclaredMethods();//all methods of this class only
			for(Method m:mArr) {
			//System.out.println(m.getName());
			System.out.println(m);
			}
			
			System.out.println();
			
			//Constructor cArr[] = c.getConstructors();//all public constructors of this class
			Constructor cArr[] = c.getDeclaredConstructors();//all constructors of this class 
			for(Constructor cr:cArr) {
				//System.out.println(cr.getName());
				System.out.println(cr);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
