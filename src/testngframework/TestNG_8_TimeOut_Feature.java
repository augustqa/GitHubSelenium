package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_8_TimeOut_Feature {
	WebDriver driver;

	@Test
	public void method1() throws InterruptedException {	
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("techlearn.in");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"KTBKoe\"]")).click();
		
	}
	
	@Test(timeOut=6000)
	public void method2() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]")).click();
		
		driver.findElement(By.xpath("//span[@class=\"KTBKoe\"]")).click();
		

	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}
