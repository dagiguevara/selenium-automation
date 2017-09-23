package Resources;



import com.relevantcodes.extentreports.ExtentReports;

public class extentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "//Users//donaldguevara//Desktop//reports.html";
		extent = new ExtentReports(Path, false);
		extent
	     .addSystemInfo("Selenium Version", "2.52")
	     .addSystemInfo("Platform", "Mac");

		return extent;
	}
}

