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

public class UseOfPageLoadTimeout {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void sendKeysUhc() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='search-desktop']")).sendKeys("Insurance");
	}

	@Test(priority = 2)
	public void sendKeysAndClick() {
		driver.findElement(By.id("search__button-desktop")).click();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
