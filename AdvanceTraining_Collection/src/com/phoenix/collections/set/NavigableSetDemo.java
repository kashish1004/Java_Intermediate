package com.phoenix.collections.set;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Double> set = new TreeSet<Double>();
		set.add(5.5);
		set.add(6.5);
		set.add(9.8);
		set.add(2.5);
		set.add(7.3);
		System.out.println("set in ascending order");
		for(double e:set)
			System.out.println(e);
		System.out.println("Ceiling of 5.5: "+set.ceiling(5.5));
		System.out.println("Ceiling of 6.6: "+set.ceiling(6.6));
		System.out.println("Ceiling of 9.9: "+set.ceiling(9.9));
		System.out.println("Floor of 6.6: "+set.floor(6.6));
		System.out.println("Floor of 5.4: "+set.floor(5.4));
		System.out.println("Floor of 2.4: "+set.floor(2.4));
		System.out.println("Higher of 6.5: "+set.higher(6.5));
		System.out.println("Higher of 9.8: "+set.higher(9.8));
		System.out.println("Lower of 9.8: "+set.lower(9.8));
		System.out.println("Lower of 2.5: "+set.lower(2.5));
	}

}
