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

public class UseOfManageByDriver {
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
}

@Test
public void maximize() {
	driver.navigate().to("https://www.ebay.com/");
	driver.manage().window().maximize();
	
}

@Test
public void sizeOfWindow() {
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	System.out.println("The size of the window is " + driver.manage().window().getSize());
}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
