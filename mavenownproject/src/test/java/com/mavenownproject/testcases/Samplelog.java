package com.mavenownproject.testcases;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Samplelog {

	//mainLogger is a logger object that we got from LogManager. All loggers are 
        //using this method only. We can consider LogManager as a factory to create
        //Logger objects
//	static Logger mainLogger = LogManager.getLogger(Samplelog.class.getName());
//
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		BasicConfigurator.configure();
//		mainLogger.info("This is just a logger");	
	Logger log = Logger.getLogger(Samplelog.class);
	log.info("This is my info log");
	log.debug("This is debug log");
	log.warn("This is warn log");
	log.error("This is error log");
	log.fatal("This is fatal log");
	log.trace("This is trace log");

	}
}


 
