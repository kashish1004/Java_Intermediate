package com.phoenix.collections.list;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 2.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.comparators.CompareNum;

public class NumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = new ArrayList<>();// no need to write Integer in <> of ArrayList compiler does that automatically
		numList.add(100);
		numList.add(101);
		numList.add(134);
		numList.add(127);
		numList.add(94);
		numList.add(110);
		numList.add(120);
		Collections.sort(numList,new CompareNum());
		System.out.println("Acc. to comparator");
		for(int ele: numList)
			System.out.print(ele+" ");
		System.out.println();
		Comparator<Integer> c = Collections.reverseOrder();
		Collections.sort(numList,c);
		System.out.println("Using Reverse Order");
		for(int ele: numList)
			System.out.print(ele + " ");
		System.out.println();
	}

}
