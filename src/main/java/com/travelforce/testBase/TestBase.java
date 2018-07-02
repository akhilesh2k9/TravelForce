package com.travelforce.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class TestBase {
	
	public static final Logger log= Logger.getLogger(TestBase.class.getName());
	
	public static void main(String args[]) throws IOException {
		TestBase tb= new TestBase();
		tb.loadData();
		
	}
	
	public void init() {
		String log4jConfPath= "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}
	
	public void loadData() throws IOException {
		log.info("===Starting");
		 Properties OR=new Properties();  
		File file = new File(System.getProperty("user.dir") + "/src/main/java/com/travelforce/config/config.properties");
		FileInputStream f = new FileInputStream(file);
		OR.load(f);
		
		System.out.println("Test Url is : "+OR.getProperty("url"));
		log.info("===End==");
	}

}
