package com.demoworkshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_JS {

	public static void pass_data(WebDriver driver,String data,WebElement element)
	{
		Utility_Objects.javascript(driver).executeScript("arguments[0].value='"+data+"'", element );
		
	}
	
	
	public static void click_disabled(WebDriver driver,String data,WebElement element)
	{
		Utility_Objects.javascript(driver).executeScript("arguments[0].click();", element );
		
	}
	
	public static void scroll(WebDriver driver,String data,WebElement element)
	{
		Utility_Objects.javascript(driver).executeScript("arguments[0].scrollIntoView();", element );
		
	}
	
	
}
