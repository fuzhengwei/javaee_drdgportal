package com.drdg.util.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.SimpleFormatter;

public class T {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {

		Calendar today = Calendar.getInstance();
		System.out.println(today.getTime());
		
		SimpleDateFormat timeFormat = new SimpleDateFormat(
		"yyyy-MM-dd");
		
		System.out.println(timeFormat.format(today.getTime()));
		
		System.out.println(timeFormat.parse(timeFormat.format(today.getTime())));
		
	}

}
