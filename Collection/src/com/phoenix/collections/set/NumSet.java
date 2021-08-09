package com.phoenix.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(100);
		set.add(120);
		set.add(410);
		set.add(150);
		set.add(810);
		set.add(105);
		set.add(140);
		set.add(140);
		System.out.println(set);
		System.out.println("Using for each loop");
		for(int e:set)
			System.out.print(e+" ");
		System.out.println();
		System.out.println("Using iterator");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
