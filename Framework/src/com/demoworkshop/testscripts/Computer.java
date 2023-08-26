package com.demoworkshop.testscripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.demoworkshop.BaseClass;
import com.demoworkshop.pomclasses.Business_logic;

public class Computer extends BaseClass {

	@Test
	public void script() throws InterruptedException
	{
		Business_logic bl=new Business_logic(driver);
		ExtentTest test = reports.createTest("COMPUTERS").assignAuthor("Santhosh");
		
		bl.getcomputes().click();
		bl.getdesktop().click();
		Thread.sleep(5000);
		bl.getowncomp().click();
		test.log(Status.PASS, "Page is displayed");
		Thread.sleep(2000);
		bl.getram().click();
		test.log(Status.PASS, "Configuration Page is displayed");
		Thread.sleep(2000);
		bl.getaddtocartbtn().click();
		test.log(Status.PASS, "Add to cart button is displayed");
		Thread.sleep(2000);
		bl.getshopcart().click();
		test.log(Status.PASS, "Add to cart button  is displayed");
		Thread.sleep(2000);
		bl.getselectproduct().click();		
		Thread.sleep(2000);
		bl.gettermsandcon().click();
		test.log(Status.PASS, "T&C button  is displayed");
		Thread.sleep(2000);
		bl.getcheckoutbtn().click();
	}
}


