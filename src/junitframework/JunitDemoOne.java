package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemoOne {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Disabled     // @Disabled only for Junit 5 - Skip 
	@Test
	void google() {
		driver.get("https://www.google.com");
	}
	
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Disabled   
	@Test
	void twitter() {
		driver.get("https://www.x.com");
	}
	
	@Ignore  // @Ignore only for Junit 3 & 4 - Skip
	@Test
	void redmine() {
		driver.get("https://www.redmine.org");
	}
	
	@Test
	void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Disabled   
	@Test
	void techlearn() {
		driver.get("https://www.techlearn.in");
	}


}
