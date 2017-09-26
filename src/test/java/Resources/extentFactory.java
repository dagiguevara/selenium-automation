package Resources;

import com.relevantcodes.extentreports.ExtentReports;

public class extentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "//Users//donaldguevara//Documents//GitHub//zopa-selenium-automation//Reports//reports.html";
		extent = new ExtentReports(Path, false);
		extent
	     .addSystemInfo("Selenium Version", "2.53.1")
	     .addSystemInfo("Platform", "Mac");
		return extent;
	}
}

