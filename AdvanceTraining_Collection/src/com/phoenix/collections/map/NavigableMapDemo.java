package com.phoenix.collections.map;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<String,Long> map = new TreeMap<String,Long>();
		map.put("Alia Bhat",884865484l);
		map.put("Shruti Hassan",6436546445l);
		map.put("Shraddha Kapoor",9578846185l);
		map.put("Urvashi Rautela",6485944749l);
		map.put("Kriti Sanon",9848941635l);
		System.out.println("Ceiling of A: "+map.ceilingKey("A"));
		System.out.println("Ceiling of Ur: "+map.ceilingKey("Ur"));
		System.out.println("Ceiling of V: "+map.ceilingKey("V"));
		System.out.println("floor of K: "+map.floorKey("K"));
		System.out.println("floor of T: "+map.floorKey("T"));
		System.out.println("higherKey of Alia Bhat: "+map.higherKey("Alia Bhat"));
		System.out.println("higherKey of V: "+map.higherKey("V"));
		System.out.println("lowerKey of A: "+map.lowerKey("A"));
		System.out.println("lowerKey of Ur: "+map.lowerKey("Ur"));
	}

}
