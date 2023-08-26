package com.demoworkshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_Actions {

	public static void mouse_hover(WebDriver driver, WebElement element)
	{
		Utility_Objects.mouse_actions(driver).moveToElement(element);
		
	}
	
	public static void mouse_doubleclick(WebDriver driver, WebElement element)
	{
		Utility_Objects.mouse_actions(driver).doubleClick(element);
		
	}
	
}
