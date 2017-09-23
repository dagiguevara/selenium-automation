package com.zopa.Tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Resources.Init;


public class SignUp_SadPath extends Init {
	
	
  @Test
  public void emailVerification() {
	  driver.findElement(By.id("member_email")).sendKeys("00000");	  
	  
  } 
}
