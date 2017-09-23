package com.zopa.Tests;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Resources.Init;


public class SignUp_SadPath extends Init {
	
	
  @Test
  public void emailVerification() throws InterruptedException {
	  driver.findElement(By.id("member_email")).sendKeys(genData.generateRandomNumber(20));
	  driver.findElement(By.id("applications_loan_apply_last_name")).click();
	  Thread.sleep(3000);
	  assertEquals(driver.findElement(By.cssSelector(".member-email>p")).getAttribute("class"), "error", "Should have error class");

  } 
}
