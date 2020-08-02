package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeDemo {

	public static void main(String[] args) {
		test();
	}

	public static void test(){

		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");

		//for headless run
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless"); //("--headless") also u can use this way
        
		//sometimes it will not work bcz of windows size 
		//options.addArguments("window-size=1366,768");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
		System.out.println("Completed");
	}
}