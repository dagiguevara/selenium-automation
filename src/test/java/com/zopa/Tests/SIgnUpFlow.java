package com.zopa.Tests;

import org.testng.annotations.Test;

import com.zopa.Pages.HomePage;
import com.zopa.Pages.LoansPage;
import com.zopa.Pages.SignUpPage;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;


 

public class SIgnUpFlow {
	
   WebDriver driver;
   
   
  
@Test
  public void SignUpFlow() throws InterruptedException {
	
	HomePage home =  PageFactory.initElements(driver, HomePage.class); 
	home.getLoanButton();
	LoansPage loan =  PageFactory.initElements(driver, LoansPage.class); 
	loan.submitLoan();
	SignUpPage SignUp =  PageFactory.initElements(driver, SignUpPage.class);
	SignUp.sendInformation();
	SignUp.submit();

	
  }


  @BeforeClass
  public  void beforeClass() {
	  	  
	 System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/chromedriver/");
	 driver = new ChromeDriver();
	 driver.get("http://www.zopa.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	 
	 driver.findElement(By.xpath("//*[@id=\"footer\"]/div[3]/p/a[2]")).click();
	
	  
  }

  @AfterClass
  public void afterClass() {
	  
	 
	 driver.quit();
	  
	  
	  
	  
  }

}
