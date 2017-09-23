package Resources;

import com.zopa.Pages.HomePage;
import com.zopa.Pages.LoansPage;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Init {
	
	public WebDriver driver; 
  
 
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
  public void afterMethod() {
	  
	  driver.quit();
  }

}
