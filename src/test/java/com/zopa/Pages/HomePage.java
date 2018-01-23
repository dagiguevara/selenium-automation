package com.zopa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = "//*[@id=\"homepage-hero\"]/div/div/div/div[1]")
    WebElement getLoanButton;
 
  public void getLoanButton() {
	  getLoanButton.click();  
  }
}

//testing 