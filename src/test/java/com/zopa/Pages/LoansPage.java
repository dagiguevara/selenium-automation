package com.zopa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoansPage {
	 @FindBy(id = "submit-loan-button")
	 WebElement submitLoan;
	
  public void submitLoan(){
	  submitLoan.click();
  }
}
