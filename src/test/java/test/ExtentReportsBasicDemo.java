package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	private static WebDriver driver=null;
	
	public static void main(String[] args){
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Workspace6\\mavenSession\\extentReport.html");
		
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Google Search", "This is test to validate google search functionality");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		
		test.log(Status.INFO,"Starting Test case");
		
		driver.get("https://www.google.com");
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Selenium");
		 
		test.pass("Entered text in searchbox");
		
		
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//input[@type='submit'")).sendKeys(Keys.RETURN); //it's work same as click() command
		test.pass("Pressed EnterKey");
		
		
		driver.close();
		driver.quit();
		
		test.pass("Closed the Browser");
		
		test.pass("Test Completed");
		
		// calling flush writes everything to the log file
        extent.flush();
		
	}

}
