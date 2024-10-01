package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_5_InvocationCount {
	WebDriver driver;

	@Test
	public void method1() throws InterruptedException {	
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("techlearn.in");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	
	@Test(invocationCount=7)
	public void method2() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Reshma");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}
