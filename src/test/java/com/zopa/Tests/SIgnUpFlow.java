package com.zopa.Tests;

import org.testng.annotations.Test;
import com.zopa.Pages.SignUpPage;
import Resources.Init;
import org.openqa.selenium.support.PageFactory;

public class SIgnUpFlow extends Init {
	
@Test
  public void SignUpFlow() throws InterruptedException {
	
	SignUpPage SignUp =  PageFactory.initElements(driver, SignUpPage.class);
	SignUp.sendInformation();
	SignUp.submit();

  }

}
