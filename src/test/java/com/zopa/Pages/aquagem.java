package com.zopa.Pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class aquagem {
	
	WebDriver driver; 
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/selenium/Roadrunner/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("http://aqua-gem-dev.acklenavenueclient.com/#/login");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id("signupInputEmail1")).sendKeys("ricky_d45@mailinator.com");
	  driver.findElement(By.id("signupInputPassword1")).sendKeys("Password123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/form/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"dashboard\"]/li[3]/a/span")).click();
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
