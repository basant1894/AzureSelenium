package charactorSequence;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterChar_Sequence_Using_sendKeys {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
		
		//1. String:
		//email.sendKeys("test12@gmail.com");
		
		//2. StringBuilder:
//		StringBuilder username = new StringBuilder()
//				.append("Basu")
//				.append(" ")
//				.append("kumar")
//				.append(" ")
//				.append("QA");
//		
//		email.sendKeys(username);
		
		//3. StringBuffer:
//		StringBuffer username1 = new StringBuffer()
//				.append("Basant")
//				.append(" ")
//				.append("Basu")
//				.append("Jharkhand");
//
//		email.sendKeys(username1);
//		
		//4. StringBuffer,StringBuilder,String, keys
		StringBuilder username = new StringBuilder()
				.append("Basu")
				.append(" ")
				.append("kumar")
				.append(" ")
				.append("QA");
		
		String space= " ";
		
		StringBuffer username1 = new StringBuffer()
				.append("Basant")
				.append(" ")
				.append("Basu")
				.append(" ")
				.append("Jharkhand");
		
		String author= "Basant Chaudhary ";

		email.sendKeys(username, space, username1, author, Keys.TAB);
		
		
	}
}
