package com.demoworkshop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class geTDataFromProperty {

	
	public static String getdata(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./files/propertyfile.properties");
		Properties pr=new Properties();
		pr.load(fis);
		 
		String value = pr.getProperty(key);
		return value;
	}

}
