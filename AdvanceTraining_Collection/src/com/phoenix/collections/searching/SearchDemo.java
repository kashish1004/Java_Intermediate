package com.phoenix.collections.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50,20,80,40,10,90};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		int searchIdx = Arrays.binarySearch(arr, 85);
		System.out.println("Element is found at: "+searchIdx);
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(101);
		numList.add(134);
		numList.add(127);
		numList.add(94);
		numList.add(110);
		numList.add(120);
		Collections.sort(numList);
	}

}