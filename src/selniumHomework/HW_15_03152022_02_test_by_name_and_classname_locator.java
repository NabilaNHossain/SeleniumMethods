package selniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_15_03152022_02_test_by_name_and_classname_locator {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.toyota.com/");
	}

	@Test(priority = 1)
	public void testClickByNameLocator() {
		driver.findElement(By.name("keyword")).click();
	}

	@Test(priority = 2)
	public void testClickByClassLocator() {
		driver.findElement(By.className("logo")).click();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
