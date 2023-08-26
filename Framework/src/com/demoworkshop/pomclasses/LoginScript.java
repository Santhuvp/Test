package com.demoworkshop.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScript extends Createtest{

	@FindBy(linkText="Log in")
	private WebElement login_link;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email_txt;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement pwd_txt;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login_btn ;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logout;
	
	public LoginScript(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement getloginlink()
	{
		return login_link;
	}
	
	public WebElement getemailfield()
	{
		return email_txt;
	}
	
	public WebElement getpwdfield()
	{
		return pwd_txt;
	}
	public WebElement getloginbtn()
	{
		return login_btn;
	}
	
	public WebElement getlogoutlink()
	{
		return logout;
	}
	
	
	
}