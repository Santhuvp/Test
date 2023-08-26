package com.demoworkshop.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Createtest {

	
	public Createtest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	
}
