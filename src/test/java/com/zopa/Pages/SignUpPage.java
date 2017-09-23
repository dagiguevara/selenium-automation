package com.zopa.Pages;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Resources.GenerateData;

  

public class SignUpPage {
	
	   GenerateData genData = new GenerateData();
	
	
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
	    
	    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/form/fieldset[3]/div[3]/p[1]/span[2]/label")
	    WebElement own_home;
	    
	    @FindBy(id = "applications_loan_apply_rent")
	    WebElement montly_rent;
	    
	    @FindBy(id = "member_password")
	    WebElement member_password;
	    
	    @FindBy(xpath = "//*[@id=\"address_from_2i\"]/option[2]")
	    WebElement month_moveIn;
	    
	    @FindBy(xpath = "//*[@id=\"address_from_1i\"]/option[3]")
	    WebElement year_moveIn;   
	    
	    @FindBy(name = "select_address")
	    WebElement select_address;
	    
 
  public void sendInformation() {
	  member_email.sendKeys(genData.generateEmail(30));
	  title.click();
	  first_name.sendKeys(genData.generateRandomString(10));
	  last_name.sendKeys(genData.generateRandomString(10));
	  home_phoneNumber.sendKeys(genData.generateRandomNumber(10));
	  birth_day.sendKeys(genData.generateRandomNumber(2));
	  birth_month.sendKeys(genData.generateRandomNumber(2));
	  birth_year.sendKeys(genData.generateRandomNumber(4));
	  loan_reason.click();
	  address_postcode.sendKeys("GL53 7BY");
	  find_address.click();
	  selectAddress.click();
	  month_moveIn.click();
	  year_moveIn.click();
	  select_address.click();
	  finantial_details.click();
	  annual_income.sendKeys(genData.generateRandomNumber(5));
	  own_home.click();
	  //montly_rent.sendKeys(genData.generateRandomNumber(5));
	  member_password.click();
	  member_password.sendKeys(genData.generateRandomAlphaNumeric(8));
	  
	  
	
  }
  
  public void  submit() {
	  try{
		    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("myfile.txt", true)));
		    writer.println("email:" + member_email.getAttribute("value"));
		    writer.println("first name: " + first_name.getAttribute("value"));
		    writer.println("last name: " + last_name.getAttribute("value"));
		    writer.println("Home Phone Number: " + home_phoneNumber.getAttribute("value"));
		    writer.println("birthday: " + birth_day.getAttribute("value"));
		    writer.println(" " +  birth_month.getAttribute("value"));
		    writer.println(" " + birth_year.getAttribute("value"));
		    writer.println("Address Post Code: GL53 7BY ");
		    writer.println("Annual Income: " + annual_income.getAttribute("value"));
		    writer.println("Member Password: " + member_password.getAttribute("value"));
		    writer.close();
		} catch (IOException e) {
		   
		}
	 
	   
  }
 
}
