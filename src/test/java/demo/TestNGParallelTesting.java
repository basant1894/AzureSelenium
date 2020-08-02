package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelTesting {
	
	WebDriver driver=null;
	
	@Test//(threadPoolSize=3, invocationCount=4, timeOut=1000)    //If you want to run a particular test according to ur requirement then use this method:
	          //(threadPoolSize=3, invocationCount=3, timeOut=1000)
	public void test1() throws Exception{
		System.out.println("I am inside Test 1 | "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		//driver.close();
	}
	@Test
	public void test2() throws Exception{
		System.out.println("I am inside Test 2 | "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		Thread.sleep(3000);
		//driver.close();	
	}
	@Test
	public void test3() throws Exception{
		System.out.println("I am inside Test 3 | "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		//driver.close();
		
	}
}
 