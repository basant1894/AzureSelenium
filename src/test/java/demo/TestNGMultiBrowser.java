package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowser {

	WebDriver driver=null;

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName){
		System.out.println("Browser name is : "+browserName);
		//System.out.println("Thread id : "+Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}	
	}

	@Test
	private void test() {
		driver.get("https://google.com");
	}
	@AfterTest
	private void teardown() {
		System.out.println("Test Completed Successfully");

	}
}