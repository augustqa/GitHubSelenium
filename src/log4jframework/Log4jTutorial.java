package log4jframework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jTutorial {
	WebDriver driver;

	@Test
	public void googlesearch() throws Exception{

		Logger log = Logger.getLogger("Search");
		PropertyConfigurator.configure("Log4j.properties");

		driver = new ChromeDriver();
		log.info("Chrome Browser Launch");

		driver.manage().window().maximize();
		log.info("Browser window Maximized");
		
		driver.get("https://www.google.com");
		log.info("Navigate to Google application");
		
		driver.findElement(By.name("q")).sendKeys("Reshma Shaik");
		log.info("In Google Search Enter the text as Reshma Shaik");
		
		Thread.sleep(1000);
		log.info("Wait for 1 Seconds");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter button pressed in Keyboard");
		
		}
}
