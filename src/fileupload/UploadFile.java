package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UploadFile {
	WebDriver driver;

	@Test
	public void attachfile() throws InterruptedException {
		driver.get("https://www.gangaaram-tech.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='textarea-23104650921']")).sendKeys("Hello Text Message");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"field-ioa3T81OSsEXwhP\"]")).sendKeys("C:\\Users\\kpuru\\OneDrive\\Documents\\Book2.xlsx");
		
		driver.findElement(By.xpath("")).submit();
		}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
