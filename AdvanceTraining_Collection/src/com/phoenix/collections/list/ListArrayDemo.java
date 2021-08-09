package com.phoenix.collections.list;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array to list conversion
		List<Integer> numList = Arrays.asList(100,200,850,400,600);
		numList.forEach(System.out::println);
		numList.set(1,1000);//only elements can be replaced,neither insertion nor deletion can be performed in this
		numList.forEach(System.out::println);
		
		//list to array conversion
		Integer[] iArr = new Integer[numList.size()];
		iArr = numList.toArray(iArr);
		for(int ele:iArr)
			System.out.print(ele+" ");
	}

}
