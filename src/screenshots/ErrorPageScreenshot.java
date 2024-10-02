package screenshots;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorPageScreenshot {
WebDriver driver;

public void BugScreenshot() throws Exception {	
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\kpuru\\OneDrive\\Documents\\Images\\Screenshots\\ErrorPageScreenshot.png"));
}
		
	@Test
	public void googlesearch() throws Exception {
		driver.get("https://www.google.com/");		
		
		try 
		{
		driver.findElement(By.name("q")).sendKeys("Selenium with Java");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("hdtb-tlsxyz")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
		}
		
		catch (Exception e) 
		{			
			System.out.println("==========Error due to========= "+e);
			BugScreenshot();
		}
	}
	


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
