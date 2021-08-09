package com.phoenix.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ActorPhoneMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Long> map = new HashMap<String,Long>();
		map.put("Alia Bhat",884865484l);
		map.put("Shruti Hassan",6436546445l);
		map.put("Shradhha Kapoor",9578846185l);
		map.put("Urvashi Rautela",6485944749l);
		map.put("Kriti Sanon",9848941635l);
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			long num = map.get(name);
			System.out.println("Actor Name: "+name + "\tNumber: " + num);
		}
	}

}
