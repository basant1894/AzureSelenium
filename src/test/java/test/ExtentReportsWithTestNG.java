package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsWithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void setUp(){
		htmlReporter = new ExtentHtmlReporter("C:\\Workspace6\\mavenSession\\extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@BeforeTest
	public void setUpTest(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();

	}
	@Test(priority=1)
	public void test1() throws IOException{
		ExtentTest test = extent.createTest("Google Search", "This is test to validate google search functionality");
		
		driver.get("https://www.google.com");
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Selenium");
		test.pass("Entered text in searchbox");
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//input[@type='submit'")).sendKeys(Keys.RETURN); //it's work same as click() command
		test.pass("Click On Submit");
		
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	}
	@Test(priority=2)
	public void test2() throws IOException{
		ExtentTest test = extent.createTest("Google Search", "This is the to validate google search functionality");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	}
	@AfterTest
	public void tearDown(){
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
		
	}
	
	@AfterSuite
	public void flush(){

		extent.flush();

	}

}


