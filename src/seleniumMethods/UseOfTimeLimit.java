package seleniumMethods;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfTimeLimit {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		it is related to the webelement only,not related to the page loading. this explicitly will give you the time to look for the webelement we're looking for within that time. and if it finds the webelement before the set time, driver will move forward to the next code.
		
	}

@Test
public void navigationTest() {
	driver.navigate().to("https://www.ebay.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
