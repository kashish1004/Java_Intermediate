package com.phoenix.enums;
/*
 * @author kashish.jain@stltech.in
 * @creation date 13-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public enum WeekDay {
	MONDAY(1),TUESDAY(2,"tues"),WEDNESDAY(3),THRUSDAY,FRIDAY,SATURDAY(6,"sat"),SUNDAY(0,"sun");
	private int dayNo;
	private String shortName;
	WeekDay() {
		// TODO Auto-generated constructor stub
		dayNo = -1;
		System.out.println("No-Arg Constructor of enum WeekDay");
	}
	WeekDay(int dayNo){
		this.dayNo = dayNo;
		System.out.println("Single parameterized Constructor of enum WeekDay");
	}
	WeekDay(int dayNo,String shortName){
		this.dayNo = dayNo;
		this.shortName = shortName;
		System.out.println("Two parameterized Constructor of enum WeekDay");
	}
	public int getDayNo() {
		return dayNo;
	}	
	public String getShortName() {
		return shortName;
	}
}
