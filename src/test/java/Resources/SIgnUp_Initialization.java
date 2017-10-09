package Resources;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.zopa.Pages.HomePage;
import com.zopa.Pages.LoansPage;
import Resources.screenshots;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class SIgnUp_Initialization {
	
	public RemoteWebDriver driver; 
	public ExtentReports report;
	public ExtentTest test;
	public GenerateData genData = new GenerateData();
 
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, MalformedURLException {
	     
	     DesiredCapabilities capability = DesiredCapabilities.chrome();
	     driver = new RemoteWebDriver (new URL ("http://ec2-34-235-112-25.compute-1.amazonaws.com:4446/wd/hub"), capability);
		 driver.get("http://www.zopa.com");
		 driver.manage().window().setSize(new Dimension(1600, 900));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 
		 driver.findElement(By.xpath("//*[@id=\"footer\"]/div[3]/p/a[2]")).click();
		 HomePage home =  PageFactory.initElements(driver, HomePage.class); 
		 home.getLoanButton();
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("scroll(250, 0)"); 
		 jse.executeScript("scroll(0, 250)"); 
		 LoansPage loan =  PageFactory.initElements(driver, LoansPage.class); 
		 loan.submitLoan();
  }
  
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		
		if (testResult.getStatus() == ITestResult.FAILURE) {
			screenshots.takeScreenshot(driver, testResult.getName());
			String path = screenshots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "test failed", imagePath);
			
		}	
		driver.quit();
		report.endTest(test);
		report.flush(); 

	}

}


