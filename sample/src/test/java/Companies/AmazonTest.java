package Companies;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonTest {
@Test
public void launch() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.Amazon.in/");
	Reporter.log("successfuly launched",true);
}
}