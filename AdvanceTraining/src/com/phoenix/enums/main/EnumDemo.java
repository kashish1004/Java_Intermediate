package com.phoenix.enums.main;
/*
 * @author kashish.jain@stltech.in
 * @creation date 13-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import com.phoenix.enums.Color;
import com.phoenix.enums.WeekDay;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Color.BLUE);
		System.out.println("Ordinal(Order): "+Color.BLUE.ordinal());
		Color c = Color.ORANGE;
		System.out.println(c);
		System.out.println("Ordinal(Order): "+c.ordinal());
		for(Color color:Color.values())
			System.out.print(color+" ");
		System.out.println();
		WeekDay today = WeekDay.TUESDAY;
		System.out.println(today);
		System.out.println("Ordinal: "+today.ordinal());
		System.out.println("Day No: "+today.getDayNo());
		System.out.println("Short Name is: "+today.getShortName());
		
			
	}

}
