package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_9_TestCases_Groups {
	WebDriver driver;
	
	@Test(groups="Tech")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(groups="Social")
	public void twitter() {
		driver.get("https://www.x.com");

	}
	
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");

	}
	
	@Test(groups="Social")
	public void facebook() {
		driver.get("https://www.facebook.com");

	}
	
	@Test(groups="Social")
	public void gmail() {
		driver.get("https://www.gmail.com");

	}
	
	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");

	}
	
	@Test(groups="Tech")
	public void redmine() {
		driver.get("https://www.redmine.org");

	}
	
	@Test(groups="Search")
	public void google() {
		driver.get("https://www.google.com");

	}
	
	@Test(groups="Tech")
	public void techlearn() {
		driver.get("https://www.techlearn.in");

	}
	
	@Test(groups="News")
	public void ndtv() {
		driver.get("https://www.ndtv.com");
	}

	@BeforeTest(groups="Social")
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
