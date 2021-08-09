package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate anyDate = LocalDate.of(2021, 7, 15);
		System.out.println(anyDate);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime time2 = LocalTime.of(10,0,15);
		System.out.println(time2);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDateTime dt1 = LocalDateTime.of(anyDate, time2);
		System.out.println(dt1);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId zdt1 = ZoneId.systemDefault();
		System.out.println(zdt1);
		
		Set<String> set = ZoneId.getAvailableZoneIds();
		System.out.println("Available Zone id's:");
		set.stream().sorted().filter(z->z.startsWith("I")||z.startsWith("America")).forEach(System.out::println);
		
		ZoneId z = ZoneId.of("Antarctica/Mawson");
		ZonedDateTime zn = ZonedDateTime.of(dt1, z) ;
		System.out.println(zn);
		
		
		
	}

}
