package com.mkyong.common.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Utility {
	public ArrayList<String> getgoogleinfo() throws IOException{
		Properties prop = new Properties();
		String propFileName = "config.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		prop.load(inputStream);
		ArrayList<String> googlecredos = null;
		googlecredos.add(prop.getProperty("GOOGLE_CLIENT_ID"));
		return googlecredos	;
		
	}
}
