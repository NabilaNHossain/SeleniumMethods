package selniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hw_15_03152022_test_by_link_and_partiallink {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://healthy.kaiserpermanente.org/front-door");
	}

	@Test
	public void testByLink() {
		driver.findElement(By.cssSelector("div#welcome-hero__content-title_FD-ExpD")).click();
	}


	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
