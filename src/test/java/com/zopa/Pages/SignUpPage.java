package com.zopa.Pages;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Resources.GenerateData;
 

public class SignUpPage {
	
	   GenerateData genData = new GenerateData();
	   
	   
	   WebDriver driver;
	   
		@FindBy(id = "member_email")
	    WebElement member_email;
		
	    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/form/fieldset[1]/div[2]/p[1]/span[2]/label")
	    WebElement title;

	    @FindBy(id = "applications_loan_apply_first_name")
	    WebElement first_name;

	    @FindBy(id = "applications_loan_apply_last_name")
	    WebElement last_name;
	    
	    @FindBy(id = "applications_loan_apply_home_phone")
	    WebElement home_phoneNumber;
	    
	    @FindBy(id = "date_of_birth_day")
	    WebElement birth_day;
	    
	    @FindBy(id = "date_of_birth_month")
	    WebElement birth_month;
	    
	    @FindBy(id = "date_of_birth_year")
	    WebElement birth_year;
	    
	    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/form/fieldset[1]/div[5]/p[1]/span[2]/label")
	    WebElement loan_reason;
	    
	    @FindBy(id = "address_postcode")
	    WebElement address_postcode;
	    
	    @FindBy(name = "find_address")
	    WebElement find_address;
	    
	    @FindBy(xpath = ("//*[@id=\"address_possible_address\"]/option[1]"))
	    WebElement selectAddress;
	    
	    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/form/fieldset[3]/div[1]/p/span[2]/label")
	    WebElement finantial_details;
	    
	    @FindBy(id = "applications_loan_apply_salary")
	    WebElement annual_income;
	    
	    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/form/fieldset[3]/div[3]/p[1]/span[3]/label")
	    WebElement own_home;
	    
	    @FindBy(id = "applications_loan_apply_rent")
	    WebElement montly_rent;
	    
	    @FindBy(id = "member_password")
	    WebElement member_password;
	    
	    @FindBy(xpath = "//*[@id=\"address_from_2i\"]/option[2]")
	    WebElement month_moveIn;
	    
	    @FindBy(xpath = "//*[@id=\"address_from_1i\"]/option[6]")
	    WebElement year_moveIn;   
	  
	    @FindBy(name = "select_address")
	    WebElement select_address;
	    
	    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/form/fieldset[4]/p[3]/span/label")
	    WebElement showPassword;
	    
	    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/form/fieldset[1]/div[5]/p[2]/a")
	    WebElement additional_loan_purposes;
	    
	    @FindBy(xpath ="//*[@id=\"content\"]/div/div/div/form/fieldset[2]/div[1]/div/div/p/input")
	    WebElement remove_address;
	    
	    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/form/fieldset[2]/div[2]/p/a")
	    WebElement add_another_address;
	    
 
  public void PersonalInformation() throws InterruptedException {
	  title.click();
	  first_name.sendKeys(genData.generateRandomString(10));
	  last_name.sendKeys(genData.generateRandomString(10));
	  home_phoneNumber.sendKeys(genData.generateRandomNumber(10));
	  birth_day.sendKeys(genData.generateRandomDay());
	  birth_month.sendKeys(genData.generateRandomMonth());
	  birth_year.sendKeys(genData.generateRandomyear());
	  loan_reason.click();
	  additional_loan_purposes.click();
	  Thread.sleep(1000);
  }
  
  public void AddressHistory() throws InterruptedException {
	  address_postcode.sendKeys("GL53 7BY");
	  find_address.click();
	  selectAddress.click();
	  month_moveIn.click();
	  year_moveIn.click();
	  select_address.click();
	  add_another_address.click();
	  address_postcode.sendKeys("SW1W 9ET");
	  find_address.click();
	  selectAddress.click();
	  month_moveIn.click();
	  year_moveIn.click();
	  select_address.click();
	  Thread.sleep(3000);
	  remove_address.click();
  }
  
  public void FinantialDetails() {
	  finantial_details.click();
	  annual_income.sendKeys(genData.generateRandomNumber(5));
	  own_home.click();
	  montly_rent.sendKeys(genData.generateRandomNumber(3));
	  member_password.click();
	  member_password.sendKeys(genData.generateRandomAlphaNumeric(15));  
	  showPassword.click();	  
  }
  
  public void  submit() {
	  try{
		    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("SignUp.csv", true)));
		    writer.append( member_email.getAttribute("value"));
		    writer.append(", " + first_name.getAttribute("value"));
		    writer.append(", " + last_name.getAttribute("value"));
		    writer.append(", " + home_phoneNumber.getAttribute("value"));
		    writer.append(", " + birth_day.getAttribute("value"));
		    writer.append(", " +  birth_month.getAttribute("value"));
		    writer.append(", " + birth_year.getAttribute("value"));
		    writer.append(", GL53 7BY");
		    writer.append(", " + annual_income.getAttribute("value"));
		    writer.println("");
		    writer.close();
		    
		} catch (IOException e) {	   
	}   
  }
}
