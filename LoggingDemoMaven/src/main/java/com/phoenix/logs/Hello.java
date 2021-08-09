package com.phoenix.logs;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Hello {

	private static final Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//special methods
		logger.info("This is info message");
		logger.debug("This is debug message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		//logger.fatal("This is fatal message");
		
		//generic methods
		logger.log(Level.TRACE,"This is trace message");
		
	}

}
