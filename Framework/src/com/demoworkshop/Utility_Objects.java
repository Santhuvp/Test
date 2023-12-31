package com.demoworkshop;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Objects {

	public static Select dropdown(WebElement element)
	{
		Select sel=new Select(element);
		return sel;
	}
	
	public static Actions mouse_actions(WebDriver driver)
	{
		Actions act= new Actions(driver);
		return act;
	}

	public static JavascriptExecutor javascript(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
			return js;		
	}
	
	
}
