package com.demoworkshop;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.demoworkshop.pomclasses.LoginScript;


public class BaseClass implements Constants {
	
	public WebDriver driver;
	public LoginScript ls;
	public ExtentReports reports;
	public ExtentHtmlReporter reporter;

	@BeforeTest
	public void reportconfig()
	{
		 reports= new ExtentReports();
		 reporter = new ExtentHtmlReporter("./reports/extent.html");
		reports.attachReporter(reporter);
	}
	
	@BeforeClass
   public void open()
   {
		System.setProperty(KEY, VALUE);
		 driver=new FirefoxDriver();
		driver.get(URL);
   }
   
   @BeforeMethod
   public void login() throws IOException
   {
	 
	    LoginScript ls=new LoginScript(driver);
	    ls.getloginlink().click();
		ls.getemailfield().sendKeys("samanderson1257@gmail.com");
	    ls.getpwdfield().sendKeys("Sam@1234");
	    ls.getloginbtn().click();
   }
   
   @AfterMethod
   public void logout()
   {
	  ls=new LoginScript(driver);
	  ls.getlogoutlink();
   }
   
   @AfterClass
   public void close()
   {
	   driver.quit();
   }
   
   @AfterTest
   public void endReport()
   {
	   reports.flush();
   }
}

