package com.phoenix.collections.map;
import java.util.Collections;
import java.util.Comparator;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 2.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.phoenix.comparators.CompareNum;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class ActorPhoneMap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,Long> map = new HashMap<String,Long>();//unordered and unsorted
		//Map<String,Long> map = new LinkedHashMap<String,Long>();//ordered and unsorted
		TreeMap<String,Long> map = new TreeMap<String,Long>();//ordered and sorted in asc. by default
		//Comparator<String> c = Collections.reverseOrder();
		//Map<String,Long> map = new TreeMap<String,Long>(c);//ordered and sorted in desc.
		map.put("Alia Bhat",884865484l);
		map.put("Shruti Hassan",6436546445l);
		map.put("Shraddha Kapoor",9578846185l);
		map.put("Urvashi Rautela",6485944749l);
		map.put("Kriti Sanon",9848941635l);
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			long num = map.get(name);
			System.out.println("Actor Name: "+name + "\tNumber: " + num);
		}
		NavigableMap<String, Long> nav = map.headMap("Shruti Hassan", true);//true - including and false - excluding
		System.out.println("HeadMap: "+nav);
		NavigableMap<String, Long> nav1 = map.tailMap("Shruti Hassan", false);
		System.out.println("TailMap: "+nav1);
		SortedMap<String, Long> subMap = map.subMap("Alia Bhat", "Shruti Hassan");
		System.out.println("SubMap: "+subMap);
	}
}
