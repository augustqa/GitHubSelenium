package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_3_Skip_Ignore_Disabled {
	WebDriver driver;

	@Test(priority=1)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(priority=4, enabled=false)
	public void twitter() {
		driver.get("https://www.x.com");
	}
	
	@Test(priority=2)
	public void facebook() {
		driver.get("https://www.facebook.com");

	}
	
	@Test(enabled=false, priority=3)
	public void gmail() {
		driver.get("https://www.gmail.com");

	}
	
	@Test(enabled=true)
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	
	@Ignore
	@Test(priority=5)
	public void google() {
		driver.get("https://www.google.com");
	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
