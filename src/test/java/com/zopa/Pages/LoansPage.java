package com.zopa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoansPage {
	 @FindBy(id = "submit-loan-button")
	 WebElement submitLoan;
	 @FindBy(xpath = "//*[@id=\"submit-loan-button\"]")
	 WebElement term;
 
	    
  public void submitLoan() throws InterruptedException {
	  submitLoan.click();
  }
}
