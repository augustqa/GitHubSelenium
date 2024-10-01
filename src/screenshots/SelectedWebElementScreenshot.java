package screenshots;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedWebElementScreenshot {
	WebDriver driver;

	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
						
		WebElement img = driver.findElement(By.xpath("//a[@aria-label='Search for Images ']"));

		File f = img.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\kpuru\\OneDrive\\Documents\\Images\\Screenshots\\GoogleImages.png")); 
		
		
		
	/*	WebElement s = driver.findElement(By.name("q"));
		s.sendKeys("TestNG"); */
		
	//	driver.findElement(By.name("q")).sendKeys("TestNG");
	}
	


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
