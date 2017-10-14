package com.zopa.Tests;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Resources.SIgnUp_Initialization;
import Resources.extentFactory;


public class SignUp_SadPath extends SIgnUp_Initialization {
	
	
  @Test
  public void emailVerification() throws InterruptedException {
	  report = extentFactory.getInstance();
	  test = report.startTest("Sign Up Flow, Email Validation Test");
	  driver.findElement(By.id("member_email")).sendKeys(genData.generateRandomNumber(20));
	  test.log(LogStatus.PASS, "entering invalid email format");
	  driver.findElement(By.id("applications_loan_apply_last_name")).click();
	  Thread.sleep(3000);
	  assertEquals(driver.findElement(By.cssSelector(".member-email>p")).getAttribute("class"), "error", "Should have error class");
	  test.log(LogStatus.PASS, "Email assertion PASSED");
  } 
  
  @Test 
  public void PostCodeValidation() {
	  report = extentFactory.getInstance();
	  test = report.startTest("SignUpFlow Postcode Validation");
	  driver.findElement(By.id("address_postcode")).sendKeys("00000");
	  test.log(LogStatus.PASS, "sending invalid postcode");
	  driver.findElement(By.name("find_address")).click();
	  test.log(LogStatus.PASS, "finding address");
	  String postcode_message = driver.findElement(By.id("error_addresses")).getText();
	  Assert.assertTrue(postcode_message.contains("We can't find this address, please try again"));
	  test.log(LogStatus.PASS, "getting Invalid postcode error message");  
	  
  }
 
}
