package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeformateScreenshot {
WebDriver driver;
	
	public void takescreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\kpuru\\OneDrive\\Documents\\Images\\Screenshots\\Google_" + time + ".png"));
	}	

	@Test
	public void googlesearch() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(2000);
		takescreenshot();
		
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		Thread.sleep(1000);
		takescreenshot();
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		takescreenshot();
		
		driver.findElement(By.id("hdtb-tls")).click();
		Thread.sleep(1000);
		takescreenshot();
	}

	@Test(enabled=false)
	public void facebook() throws Exception {
		driver.get("http://seleniumlearn.com/selenium-commands");
		Thread.sleep(6000);
		takescreenshot();

		String selectalltext = Keys.chord(Keys.CONTROL, "a"); // select all text in techlearn.in home page
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).sendKeys(selectalltext);		           
	//	Screenshot();
		takescreenshot();

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
