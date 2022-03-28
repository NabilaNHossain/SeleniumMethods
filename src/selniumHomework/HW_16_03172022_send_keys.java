package selniumHomework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_03172022_send_keys {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.southwest.com/");
	}

	@Test(priority = 2)
	public void sendKeys() {
		driver.findElement(By.xpath("//input[@id='LandingAirBookingSearchForm_promoCode']")).sendKeys("SUMMERB");
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
