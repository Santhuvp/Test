package com.demoworkshop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Select {

	public static void select_option(WebElement element,Object value)
	{
		Select sel = Utility_Objects.dropdown(element);
		
		if(value instanceof Integer)
		{
			sel.selectByIndex((Integer) value);
		}
		else if(value instanceof String)
		{
			try{
			sel.selectByValue((String) value);
			}
			catch(Exception e)
			{
				sel.selectByVisibleText((String) value);
			}
		}
	}
	
	
}
