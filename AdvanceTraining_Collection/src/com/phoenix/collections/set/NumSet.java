package com.phoenix.collections.set;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.phoenix.comparators.CompareNum;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class NumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> set = new HashSet<Integer>();//unorderd and unsorted
		//Set<Integer> set = new LinkedHashSet<Integer>();//ordered and unsorted
		//Set<Integer> set = new TreeSet<Integer>();//ordered and sorted in asc by default
		//Set<Integer> set = new TreeSet<Integer>(new CompareNum());//ordered and sorted in desc
		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());//ordered and sorted
		set.add(10);
		set.add(100);
		set.add(120);
		set.add(410);
		set.add(140);
		set.add(140);
		System.out.println(set);
		System.out.println("Using for each loop:");
		for(int e:set)
			System.out.print(e+" ");
		System.out.println();
		System.out.println("Using iterator:");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
