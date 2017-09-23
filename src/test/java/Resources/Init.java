package Resources;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.zopa.Pages.HomePage;
import com.zopa.Pages.LoansPage;
import Resources.screenshots;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Init {
	
	public WebDriver driver; 
	public ExtentReports report;
	public ExtentTest test;
	public GenerateData genData = new GenerateData();
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/chromedriver/");
		 driver = new ChromeDriver();
		 driver.get("http://www.zopa.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	 
		 driver.findElement(By.xpath("//*[@id=\"footer\"]/div[3]/p/a[2]")).click();
		 HomePage home =  PageFactory.initElements(driver, HomePage.class); 
		 home.getLoanButton();
		 LoansPage loan =  PageFactory.initElements(driver, LoansPage.class); 
		 loan.submitLoan();
  }
  
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		/*
		if (testResult.getStatus() == ITestResult.FAILURE) {
			screenshots.takeScreenshot(driver, testResult.getName());
			String path = screenshots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "test failed", imagePath);
			
		}	
		driver.quit();
		report.endTest(test);
		report.flush(); */

	}

}


