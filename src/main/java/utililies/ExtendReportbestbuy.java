package utililies;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportbestbuy {

	public static ExtentReports getreport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\Aravind\\eclipse-workspace\\BestBuy\\reports\\report.html");
		reporter.config().setReportName("BestBuy test");
		reporter.config().setDocumentTitle("test reports");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
		
	}

}
