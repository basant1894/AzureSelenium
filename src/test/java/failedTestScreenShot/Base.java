package failedTestScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initialization(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	public void failed(String testMethodName){    //if u want to take screenshot for multiple failed test cases with separate name then we have to go this way
	//public void failed(){  //for single screenshot
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(srcFile, new File("./screenshots/google.png"));   //for single
			
			FileUtils.copyFile(srcFile, new File("C:/Workspace6/mavenSession/screenshots/"+testMethodName+"_"+".png")); //for multiple
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
