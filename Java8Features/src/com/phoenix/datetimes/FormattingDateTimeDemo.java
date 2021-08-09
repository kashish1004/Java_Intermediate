package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		//DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Formated Date: "+date.format(dtf));
		
		//custom date format
		//DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		//DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(date.format(dtf1));
		
		LocalTime time = LocalTime.of(15,20,36);
		System.out.println(time);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println("Formated Time: "+time.format(dtf2));
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println("Formated Time: "+time.format(dtf3));
		
	}

}
