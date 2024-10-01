package screenshots;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FullpageScreenshot {
	WebDriver driver;

	@Test
	public void CompletePageScreenshot() throws IOException, Exception {
		driver.get("http://seleniumlearn.com/selenium-tutorial");
		Thread.sleep(3000);
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\kpuru\\OneDrive\\Documents\\Images\\Screenshots\\FullPageScreenshot.png"));
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
