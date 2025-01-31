package ExtentReport;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
@Test
public void createReport() {
	String timestamp =LocalDateTime.now().toString().replace(":","-");
	//1 create an instance of Extent Spark reporter
	//ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Report/ExtentReport.html");
	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Report/"+timestamp+".html");
	
	//2 create an instance ExtentReports
	ExtentReports extReport =new ExtentReports();
	
	//3 attach ExtentSparkReporter to Extent Reports
	extReport.attachReporter(spark);
	
	//4 create an instance of ExtentTest
	ExtentTest test= extReport.createTest("createReport");
	
	//5 call log() to provide status and message
	test.log(Status.PASS,"message added into report");
	test.log(Status.INFO,"adding info status");
	//6 call flush()
	extReport.flush();
}
}
