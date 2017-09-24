package com.zopa.Tests;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import com.zopa.Pages.SignUpPage;
import Resources.Init;
import Resources.extentFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;



public class SignUpFlow extends Init {
	
	
	
@Test
  public void SignUpFlow(){
	
	report = extentFactory.getInstance();
	test = report.startTest("Sign Up Flow Happy Path");
	SignUpPage SignUp =  PageFactory.initElements(driver, SignUpPage.class);
	driver.findElement(By.id("member_email")).sendKeys(genData.generateEmail(30));
	test.log(LogStatus.PASS, "Validaxte Email PASSED");
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
