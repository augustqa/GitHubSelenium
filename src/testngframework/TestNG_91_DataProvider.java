package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestNG_91_DataProvider {
	WebDriver driver;
	
	@DataProvider(name = "datainput")
	public String[][] login() {
		return new String[][] { 
			{ "usha", "InValidPassword"}, 
			{ "sravani", "9000109120" },
			{ "sunil", "ABCDEF" },
			{ "lokesh", "123456789" },
			{ "swetha", "ABCDEFGHI" },
			{ "manoj", "9980251000"}, 
			{ "akhil", "InValidPassword"}, 
			{ "lavanya", "9000109120" },
			{ "shiva", "Hello@123"},
			{ "chethan", "9980251000"} 
			};
	}

	@Test(dataProvider = "datainput")
	public void login(String usr, String pswd) throws Exception {
	
		driver.get("http://hyderabadreport.com/user");
		
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys(usr);
		driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		try 
		{
			driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
				System.out.println("PASS");
		} 
		catch (Exception e) 
		{		
			System.out.println("FAIL");
		}
	}

	@BeforeTest
	public void beforeTest() {			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}