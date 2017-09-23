package com.zopa.Pages;

import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

     

public class NewTest {
	
	WebDriver driver;
	WebElement search;
	
	@BeforeClass
	 public  void beforeClass() {
	  	  
		 System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/chromedriver/");
		 driver = new ChromeDriver();
		 driver.get("http://google.hn");
		 search = driver.findElement(By.id("lst-ib"));
		 search.sendKeys("donald");
		
		 

		  try{
			    PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
			    writer.println("email:" + search.getAttribute("value"));
			    writer.println("H");
			    writer.close();
			} catch (IOException e) {
			   // do something
			}
		 
		 
	}
  
		 
		 @Test
  
  public void f() {
	  
	  
	  
	  
  }
}
