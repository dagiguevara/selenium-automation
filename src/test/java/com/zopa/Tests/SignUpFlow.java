package com.zopa.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import com.zopa.Pages.SignUpPage;
import Resources.SIgnUp_Initialization;
import Resources.extentFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class SignUpFlow extends SIgnUp_Initialization {
	
		
@Test
  public void  SignUpFlow() throws InterruptedException{	
	report = extentFactory.getInstance();
	test = report.startTest("Sign Up Flow Happy Path");
	SignUpPage SignUp =  PageFactory.initElements(driver, SignUpPage.class);
	driver.findElement(By.id("member_email")).sendKeys(genData.generateEmail(30));
	Thread.sleep(1000);
	Assert.assertNotEquals(driver.findElement(By.cssSelector(".member-email>p")).getAttribute("class"), "error" , "should not have error class");
	test.log(LogStatus.PASS, "Validate Email PASSED");
	SignUp.PersonalInformation();
	test.log(LogStatus.PASS, "Personal Information COMPLETE");
	SignUp.AddressHistory();
	test.log(LogStatus.PASS, "Address History COMPLETE");
	SignUp.FinantialDetails();
	test.log(LogStatus.PASS, "Finantial Details COMPLETE");
	SignUp.submit();
	test.log(LogStatus.PASS, "Sending Information to a file.txt");  
  }
}
