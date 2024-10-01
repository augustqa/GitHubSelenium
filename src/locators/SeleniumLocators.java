package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class SeleniumLocators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void idnameclassnamecssselector() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("techlearn.in");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.className("form-submit")).click();
	}
	
	@Disabled
	@Test
	void idnameclassnamecssselector1() throws InterruptedException {
		driver.get("http://seleniumlearn.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("sravani");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-captcha-response")).sendKeys("10");
		Thread.sleep(2000);
		
	//	driver.findElement(By.cssSelector("#edit-submit")).click();
	//	driver.findElement(By.cssSelector("input#edit-submit")).click();
	//	driver.findElement(By.cssSelector(".form-submit")).click();
		driver.findElement(By.cssSelector("input.form-submit")).click();

	}
	
	@Disabled
	@Test
	void linktextpartiallinktext() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://hyderabadreport.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Telangana")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("News")).click();
}
	
	@Disabled
	@Test
	void tagname() throws InterruptedException {
		driver.get("https://www.ndtv.com/");
		Thread.sleep(2000);
		
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		System.out.println("Total images on NDTV Application : "+images.size());
		
	/*	List<WebElement> ndtvlinks = driver.findElements(By.tagName("a"));
		System.out.println(ndtvlinks.size());
		
		System.out.println("Total links on NDTV : "+ndtvlinks.size());  */
		
}
	
	
	@Test
	void xpath() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("techlearn");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("lokesh");
		
		driver.findElement(By.xpath("//*[text()='Lost password']")).click();
		
		Select obj = new Select(driver.findElement(By.xpath("//*[@name='user[language]']")));
		//obj.selectByVisibleText("Arabic (عربي)");
		//obj.selectByValue("ar");
		obj.selectByIndex(2);
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

		Alert obj1 = driver.switchTo().alert();
		obj1.accept();
		obj1.dismiss();
		obj1.sendKeys("input value");
}

}
